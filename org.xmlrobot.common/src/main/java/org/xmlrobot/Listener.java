package org.xmlrobot;

import java.util.EventListener;

/**
 * Polymorphic implementation of a {@code listener}. A {@code listener} in object
 * oriented programming is an {@link org.xmlrobot.Entity} to order events by
 * asynchronously recurring to concurrent executions or events. It is a parent
 * programming class for programming recurrent and recursive programs, allowing
 * programmers to extend event generation from asynchronous event ordering logic.
 * <p>
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 */
public interface Listener extends Entity, EventListener {

	//listeners
	/**
	 * Adds new {@link Listener} for current instance.
	 * @param listener {@link Listener} the new listener.
	 */
	void addListener(Listener listener);
	
	/**
	 * Removes new {@link Listener} for current instance.
	 * @param listener {@link Listener} the new listener.
	 */
	void removeListener(Listener listener);
	
	//the event
	/**
	 * The {@code parent} recurring event.
	 * @param e {@link EventArgs} the event arguments
	 */
	void event(Object sender, Argument e);
	
	//methods
	/**
	 * Returns a new instance of {@code this} class
	 * by setting new properties.
	 * @return a new instance of {@code this} class
	 * by setting new properties
	 */
	Listener clone();
}