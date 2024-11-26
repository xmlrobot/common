package org.xmlrobot.time;

import org.xmlrobot.numbers.Enumerable;

public interface Recurrence<K>
	extends Enumerable<K>, java.util.concurrent.Callable<K> {

	/**
	 * Gets the parent corresponding to this past.
	 * @return the parent corresponding to this past
	 */
	K getParent();

	/**
	 * Sets the parent corresponding to this past.
	 * @param parent new parent to be inherited in this past
	 * @return the old parent corresponding to this past
	 */
	K setParent(K key);
	
	/**
	 * Gets the past corresponding to this past.
	 * @return the past corresponding to this past
	 */
	@Override
	K call();

	/**
	 * Sets the past corresponding to this past.
	 * @param past new past to be inherited in this past
	 * @return the old past corresponding to this past
	 */
	K put(K past);
}