package org.xmlrobot.time;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @param <V>
 * 
 * @see Recurrence
 */
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

	// old
	@Deprecated
	@Override
	default boolean cancel(boolean mayInterruptIfRunning) {
		return false;
	}
	@Deprecated
	@Override
	default boolean isCancelled() {
		return false;
	}
	@Deprecated
	@Override
	default boolean isDone() {
		return false;
	}
	@Deprecated
	@Override
	default V get(long timeout, TimeUnit unit)
		throws InterruptedException, ExecutionException, TimeoutException {
		return null;
	}
}