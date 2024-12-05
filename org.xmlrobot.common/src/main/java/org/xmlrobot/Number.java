package org.xmlrobot;

import java.io.Serializable;

import org.xmlrobot.numbers.Enumerator;
import org.xmlrobot.time.Past;

public abstract class Number<N extends Past<N>> 
	extends java.lang.Object implements Past<N>, Serializable {
	
	private static final long serialVersionUID = -3609491763992988642L;
	
	/**
	 * The parent recurrence
	 */
	private N parent;

	@Override
	public N getParent() {
		return parent;
	}
	@Override
	public N setParent(N parent) {
		N old = this.parent;
		this.parent = parent;
		return old;
	}
	
	@SuppressWarnings("unchecked")
	protected Number() {
		parent = (N) this;
	}
	@SuppressWarnings("unchecked")
	protected Number(N parent) {
		setParent(parent.getParent());
		parent.setParent((N) this);
	}

	public boolean isEmpty() {
		return getParent() == this;
	}
	public void recur(N parent) {
		parent.setParent(getParent());
		setParent(parent);
	}
	public void clear() {
		getParent().setParent(setParent(getParent().getParent()));
	}
	
	@Override
	public Enumerator<N> enumerator() {
		return new ParentEnumerator(getParent());
	}
	
	private final class ParentEnumerator implements Enumerator<N> {

		/**
		 * The current number.
		 */
		private N current;

		/**
		 * The next number.
		 */
		private N parent;
		
		/**
		 * If this enumerator has next number.
		 */
		private boolean hasNext;

		ParentEnumerator(N parent) {
			this.parent = current = parent;
			hasNext = true;
		}

		@Override
		public boolean hasMoreElements() {
			return hasNext;
		}
		@Override
		public N nextElement() {
			current = parent;
			parent = current.getParent();
			if (current == Number.this) {
				hasNext = false;
			} else hasNext = true;
			return current;
		}
		@Override
		public void remove() {
			current.clear();
			if (!current.isEmpty()) {
				parent = current.getParent();
			} else hasNext = false;
		}
	}
	/**
	 * Creates new object of type X with the given arguments.
	 * @param <X> the parameter type of the returned object
	 * @param c the {@link Class} of the object.
	 * @param object the arguments of the construction of the object
	 * @return the new <X> instance
	 */
	protected static <X> X create(Class<X> c, java.lang.Object parent, java.lang.Object element) {
		try {
			return c.getDeclaredConstructor(parent.getClass(), element.getClass()).newInstance(parent, element);
		}
		catch(Throwable t) {
			throw new Error(t);
		}
	}
}