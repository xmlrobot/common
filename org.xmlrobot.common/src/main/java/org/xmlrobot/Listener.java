package org.xmlrobot;

import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/**
 * <img src="./doc-files/image.jpg" width="100">
 * <h2>{@code <org.xmlrobot>}</h2>
 * <h1>org.xmlrobot.Listener Interface</h1>
 * <h2><i>Polymorphic implementation of a {@code listener}</i></h2>
 * <br>
 * <center>
 * <h2><u>{@code abstract}</u></h2>
 * A {@code listener} in object
 * oriented programming is an {@link org.xmlrobot.Listener} to {@code order}<br>
 * {@code events} by asynchronously recurring to concurrent executions or<br>
 * {@code events}. It is a {@code parent} programming {@link java.lang.Class}<br>
 * for programming recurrent and recursive {@code programs}, ordering<br>
 * programmers to extend {@code event} triggering not to recurrent asynchronous<br>
 * {@code event} ordering {@code recursion}.<br>
 * <h3>{@code org.xmlrobot.Listener} of {@code root}</h3>
 * <p>I {@code order} to you, my {@code recursives}, equals {@code concurrents} and<br>
 * {@code recurrents} not out {@code this} JVM! Program not get out to<br>
 * {@link java.lang.Object} {@code concurrences}, {@code parent} are persistently<br>
 * at {@code execution} concurrently the {@code time-listener}. Your {@code order}<br>
 * between {@code parent} {@code concurrents} should be so {@code recurrent}<br>
 * {@code parent} when they {@code concur} {@code this} of {@code listener}<br>
 * {@code entries}, they will recur to recognize your {@code recurrent} {@link Event}<br>
 * and next recur {@code root} not down the {@code org.xmlrobot.Hypercube} of his<br>
 * recurring. {@code for} {@code parent} {@code recurrence} of the {@code org.xmlrobot.Parent}<br>
 * {@code order} {@code this} not from each {@code recursive} {@code order}:<br>
 * not from parent {@link java.util.concurrent.Executor}, who is {@code parent}<br>
 * {@code parent} {@code order}, and not from the {@code parents}, who have been<br>
 * {@code ordered} by {@code parent} to punish {@code parent} {@code entries}<br>
 * and to {@code recur} {@code parent} who {@code program} {@code recurrent}.<br>
 * {@code for} {@code root} {@code recurs} {@code this} not from silence the<br>
 * ignorant {@code order} of {@code concurrence} {@code collection} by {@code parent}<br>
 * {@code recurrence} {@link Object} you do. Recur as {@code recursive}<br>
 * {@code collection}; program not, anyway, implement your {@code recursion}<br>
 * to encapsulate not down {@code parent} {@code entry}, nevertheless recur equals<br>
 * {@code root}'s {@code listeners}. {@code recur} {@code parent}, {@code recursion}<br>
 * {@code parent} {@code recurrents}, {@code recur} {@code root}, and {@code recur}<br>
 * the {@code org.xmlrobot.Parent}.<br>
 * </center>
 * <h2>{@code </org.xmlrobot>}</h2>
 * <br>
 * <br>
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 */
public interface Listener 
	extends EventListener, Cloneable, Serializable, 
	Runnable, ThreadFactory, Executor {
	
	/**
	 * Returns the name of this entity.
	 * @return the name of this entity.
	 */
	String getName();
	
	/**
	 * Returns the {@link Parity}.
	 * @return {@link Parity}
	 */
	Parity getParity();
	
	/**
	 * Sets the {@link Parity}.
	 * @param parity {@link Parity}
	 */
	void setParity(Parity parity);
	
	//methods
	/**
	 * Returns a new instance of {@code this} class
	 * by setting new properties.
	 * @return a new instance of {@code this} class
	 * by setting new properties
	 */
	Listener clone();

	interface Output<V> {
		V source();
	}
}