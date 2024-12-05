package org.xmlrobot.time;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface Concurrence<V>
	extends Future<V>, java.util.concurrent.Future<V> {
	
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
	
	boolean hasChild(V child);
	boolean releaseChild(V child);
	boolean hasAllChildren(V child);
	boolean releaseAllChildren(V child);
	boolean retainAllChildren(V child);

	// DEPRECATION
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