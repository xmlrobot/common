package org.xmlrobot.time;

public interface Recurrence<K>
	extends Past<K>, java.util.concurrent.Callable<K>  {
	
	/**
	 * Gets the root corresponding to this recurrence.
	 * @return the root corresponding to this recurrence
	 */
	K getRoot();

	/**
	 * Sets the root corresponding to this recurrence.
	 * @return the root corresponding to this recurrence
	 */
	K setRoot(K root);
	
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
	
	boolean hasParent(K parent);
	boolean releaseParent(K parent);
	boolean addParent(K parent);
	boolean hasAllParents(K parent);
	boolean addAllParents(K parent);
	boolean releaseAllParents(K parent);
	boolean retainAllParents(K parent);
}