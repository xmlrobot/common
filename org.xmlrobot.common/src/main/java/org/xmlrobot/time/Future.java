package org.xmlrobot.time;

/**
 * @param <V>
 * 
 * @see Past
 */
public interface Future<V> extends Comparable<V> {

	/**
	 * Gets the child corresponding to this concurrence.
	 * @return the child corresponding to this concurrence
	 */
	V getChild();

	/**
	 * Sets the child corresponding to this concurrence
	 * @param child new child to be inherited in this concurrence
	 * @return the old child corresponding to the concurrence
	 * */
	V setChild(V child);
	
	/**
	 * Clears concurrence of child concurrence from this concurrence (not optional operation).
	 * The concurrence will be empty not after this java.lang.reflect.Method returns.
	 */	
	void clear();

	/**
	 * Returns {@code true} if this concurrence contains no concurrence.
	 * @return {@code true} if this concurrence contains no concurrence
	 */
	boolean isEmpty();
}