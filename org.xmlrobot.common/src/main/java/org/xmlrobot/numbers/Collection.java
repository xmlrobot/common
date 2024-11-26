package org.xmlrobot.numbers;

import java.io.Serializable;

import org.xmlrobot.time.Recurrence;

public interface Collection<E>
	extends Recurrence<Collection<E>>, java.util.Collection<E>, Serializable {

	// properties
	/**
	 * Returns the element contained in this {@link Collection} instance.
	 * @return the element contained in this {@link Collection} instance.
	 */
	E getElement();

	/**
	 * Sets the element contained in this {@link Collection}.
	 * @param element the element
	 * @return the old element contained in this {@link Collection}.
	 */
	E setElement(E element);
}