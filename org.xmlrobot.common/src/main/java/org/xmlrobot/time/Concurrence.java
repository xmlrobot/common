package org.xmlrobot.time;

public interface Concurrence<V> 
	extends Comparable<V>, java.util.concurrent.Future<V> {

	/**
	 * Gets the child corresponding to this future.
	 * @return the child corresponding to this future
	 */
	V getChild();

	/**
	 * Sets the child corresponding to this future
	 * @param child new child to be inherited in this future
	 * @return the old child corresponding to the future
	 * */
	V setChild(V child);

	/**
	 * Gets the future corresponding to this future.
	 * @return the future corresponding to this future
	 */
	V get();
	
	/**
	 * Sets the future corresponding to this future
	 * @param future new future to be inherited in this future
	 * @return the old future corresponding to the future
	 * */
	V set(V future);
}