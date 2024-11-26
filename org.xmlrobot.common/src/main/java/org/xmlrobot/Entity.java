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

	/*EVENT TYPES*/
	/**
	 * Orders parent event to execute instruction.
	 * @see javax.xml.stream.events.ProcessingInstruction
	 */
	public static final int GENESIS = 0;

	/**
	 * Indicates an event is a start element.
	 * @see javax.xml.stream.events.StartElement
	 */
	public static final int LISTEN = 1;

	/**
	 * Indicates an event is an end element.
	 * @see javax.xml.stream.events.EndElement
	 */
	public static final int TRANSFER = 2;
	
	/*PROPERTIES*/
	/**
	 * Returns the name of this listener.
	 * @return the name of this listener.
	 */
	String getName();
	
	/**
	 * Returns the event type.
	 * @return the event type.
	 */
	int getEventType();
	
	/**
	 * Sets the event type.
	 * @param command {@link String} the event type
	 */
	void setEventType(int command);
	
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
	
	/*METHODS*/
	/**
	 * Returns a new instance of {@code this} class
	 * by setting new properties.
	 * @return a new instance of {@code this} class
	 * by setting new properties
	 */
	Listener clone();
}