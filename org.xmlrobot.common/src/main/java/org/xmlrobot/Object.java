package org.xmlrobot;

import java.util.Iterator;

import org.xmlrobot.numbers.Enumerator;

public abstract class Object
	extends java.lang.Object implements Listener {
	
	private static final long serialVersionUID = 3811280142467995386L;

	/**
	 * The parity
	 */
	private Parity parity;
	
	/**
	 * The event type
	 */
	private int eventType;
	
	/**
	 * A number of listeners
	 */
	private Listeners listeners;
	
	@Override
	public Parity getParity() {
		return parity;
	}
	@Override
	public void setParity(Parity parity) {
		this.parity = parity;
	}
	@Override
	public int getEventType() {
		return eventType;
	}
	@Override
	public void setEventType(int eventType) {
		this.eventType = eventType;
		sendEvent(new Event(this));
	}
	
	/**
	 * {@link Object} default class constructor
	 */
	public Object() {
		super();
		this.parity = Parity.YY;
		this.eventType = GENESIS;
	}
	public Object(Parity parity) {
		super();
		this.parity = parity;
		this.eventType = GENESIS;
	}

	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link java.lang.Object}.
	 */
	@Override
	public final boolean equals(java.lang.Object object) {
		return this == object;
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link org.xmlrobot.EventListener}.
	 */
	@Override
	public void addListener(EventListener listener) {
		if(listeners == null) {
			listeners = new Object.Listeners(listener);
			return;
		}
		listeners.add(listener);
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link org.xmlrobot.EventListener}.
	 */
	public void removeListener(EventListener listener) {
		if(listeners == null) {
			return;
		}
		listeners.remove(listener);
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link org.xmlrobot.EventListener}.
	 */
	@Override
	public void onEventReceived(Object sender, Event e) {
		sendEvent(e);
	}
	/**
	 * Sends event to all listeners of this instance.
	 * @param e the event to send
	 */
	protected void sendEvent(Event e) {
		if(listeners != null) {
			Iterator<EventListener> iterator = listeners.iterator();
			while(iterator.hasNext()) {
				iterator.next().onEventReceived(this, e);
			}
		}
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link java.lang.Object}.
	 */
	@Override
	public Listener clone() {
		try {
			Listener entity = getClass().getConstructor().newInstance();
			entity.setParity(parity);
			return entity;
		} catch (Throwable t) {
			throw new Error("org.xmlrobot.Object: clone exception.", t);
		}
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link java.util.concurrent.Executor}.
	 */
	@Override
	public void execute(Runnable program) {
		try {
			newThread(program).start();
		}
		catch (Throwable t) {
			throw new Error(t);
		}
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link java.util.concurrent.ThreadFactory}.
	 */
	@Override
	public Thread newThread(Runnable program) {
		return new Thread(program);
	}
	/**
	 * {@inheritDoc}
	 * <p>Inherited from {@link java.lang.Runnable}.
	 */
	@Override
	public void run() {
		switch (getEventType()) {
		case LISTEN:
			setEventType(TRANSFER);
			break;
		default:
			setEventType(LISTEN);
			break;
		}
	}
	/**
	 * An {@link Iterable} number of listeners.
	 */
	private final class Listeners extends Number<Listeners>
		implements Iterable<EventListener> {

		private static final long serialVersionUID = 414566453327042951L;
		
		/**
		 * The encapsulated listener
		 */
		private EventListener listener;

		/**
		 * Gets the encapsulated listener.
		 * @return the encapsulated listener
		 */
		EventListener getListener() {
			return listener;
		}
		void setListener(EventListener listener) {
			this.listener = listener;
		}
		
		Listeners(EventListener listener) {
			super();
			this.listener = listener;
		}
		Listeners(Listeners parent, EventListener listener) {
			super(parent);
			this.listener = listener;
		}
		
		public void add(EventListener listener) {
			if(this.listener == null) {
				this.listener = listener;
				return;
			}
			super.recur(new Listeners(this, listener));
		}
		public void remove(EventListener listener) {
			Iterator<EventListener> it = iterator();
			while(it.hasNext()) {
				if(it.next().equals(listener)) {
					it.remove();
					return;
				}
			}
		}
		@Override
		public Iterator<EventListener> iterator() {
			return new ListenerIterator(enumerator());
		}
		
		private final class ListenerIterator implements Iterator<EventListener> {
			Enumerator<Listeners> enumerator;
			Listeners current;
			ListenerIterator(Enumerator<Listeners> enumerator) {
				this.enumerator = enumerator;
			}
			@Override
			public boolean hasNext() {
				return enumerator.hasMoreElements();
			}
			@Override
			public EventListener next() {
				current = enumerator.nextElement();
				return current.getListener();
			}
			@Override
			public void remove() {
				current.setListener(current.getParent().getListener());
				enumerator.remove();
			}
		}
	}
	/**
	 * Creates new object of type X with the given arguments.
	 * @param <X> the parameter type of the returned object
	 * @param c the {@link Class} of the object.
	 * @param object the arguments of the construction of the object
	 * @return the new <X> instance
	 */
	protected static <X> X create(Class<X> c, java.lang.Object... args) {
		try {
			return c.getDeclaredConstructor(getClasses(args)).newInstance(args);
		}
		catch(Throwable t) {
			throw new Error(t);
		}
	}
	private static Class<?>[] getClasses(java.lang.Object... objects) {
		Class<?>[] classes = new Class<?>[objects.length];
		for(int i = 0; i < objects.length; i++) {
			classes[i] = objects[i].getClass();
		}
		return classes;
	}
}