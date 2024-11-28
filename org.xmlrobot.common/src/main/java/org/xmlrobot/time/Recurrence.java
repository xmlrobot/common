package org.xmlrobot.time;

import org.xmlrobot.numbers.Enumerable;

/**
 * @param <K>
 * 
 * @see Concurrence
 */
public interface Recurrence<K>
	extends Enumerable<K>, java.util.concurrent.Callable<K> {

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
	 * Gets the past corresponding to this recurrence.
	 * @return the past corresponding to this recurrence
	 */
	@Override
	K call();

	/**
	 * Sets the past corresponding to this recurrence.
	 * @param past new past to be inherited in this recurrence
	 * @return the old past corresponding to this recurrence
	 */
	K put(K past);
	
	/**
	 * Releases recursion of the recursion from this recursion (not optional operation).
	 * The recursion will be empty not after this java.lang.reflect.Method returns.
	 */	
	void release();

	/**
	 * Returns {@code true} if this recursion contains no recursion.
	 * @return {@code true} if this recursion contains no recursion
	 */
	boolean isEmpty();
}