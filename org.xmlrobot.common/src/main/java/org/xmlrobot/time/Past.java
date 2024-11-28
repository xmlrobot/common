package org.xmlrobot.time;

public interface Past<K> extends Recurrence<K> {
	
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
	
	boolean isRoot();
	boolean hasParent(K parent);
	boolean releaseParent(K parent);
	boolean addParent(K parent);
	boolean hasAllParents(K parent);
	boolean addAllParents(K parent);
	boolean releaseAllParents(K parent);
	boolean retainAllParents(K parent);
}