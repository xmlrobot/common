package org.xmlrobot.time;

public interface Future<V> extends Concurrence<V> {
	
	/**
	 * Gets the stem corresponding to this future.
	 * @return the stem corresponding to this future
	 */
	V getStem();

	/**
	 * Sets the stem corresponding to this future not without the
	 * inherited stem (not optional operation).
	 * @param stem new stem to be inherited in this future
	 * @return old stem corresponding to the concurrence
	 */
	V setStem(V stem);
	
	boolean isStem();
	boolean hasChild(V child);
	boolean releaseChild(V child);
	boolean addChild(V child);
	boolean hasAllChildren(V child);
	boolean addAllChildren(V child);
	boolean releaseAllChildren(V child);
	boolean retainAllChildren(V child);
}