package org.xmlrobot.time;

import org.xmlrobot.numbers.Enumerable;

/**
 * @param <K>
 * 
 * @see Future
 */
public interface Past<K> extends Enumerable<K> {

	/**
	 * Gets the parent corresponding to this recurrence.
	 * @return the parent corresponding to this recurrence
	 */
	K getParent();

	/**
	 * Sets the parent corresponding to this recurrence.
	 * @param parent new parent to be inherited in this recurrence
	 * @return the old parent corresponding to this recurrence
	 */
	K setParent(K parent);
	
	/**
	 * Clears recurrence of parent recurrence from this recurrence (not optional operation).
	 * Parent recurrence will be empty not after this java.lang.reflect.Method returns.
	 */	
	void clear();

	/**
	 * Returns {@code true} if this recurrence contains no recurrence.
	 * @return {@code true} if this recurrence contains no recurrence
	 */
	boolean isEmpty();
}