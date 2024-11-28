package org.xmlrobot;

import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/**
 * <p>Polymorphic implementation of an {@code entity}.
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 */
public interface Entity 
	extends Cloneable, Serializable, Runnable, ThreadFactory, Executor {
	
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
	 * Returns a new instance of {@code this} class by setting
	 * new properties.
	 * @return a new instance of {@code this} class by setting
	 * new properties
	 */
	Entity clone();
}