package org.xmlrobot;

import java.io.Serializable;

/**
 * <img src="./doc-files/image.jpg" width="100">
 * <h1>org.xmlrobot.EventListener Interface</h1>
 * <h2><i>Polymorphic implementation of an {@code event-listener}</i></h2>
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 */
public interface EventListener extends java.util.EventListener, Serializable {

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
	 * Adds new {@link EventListener} for current instance.
	 * @param listener {@link EventListener} the new listener to be added.
	 */
	void addListener(EventListener listener);

	/**
	 * Removes old {@link EventListener} for current instance.
	 * @param listener {@link EventListener} the old listener to be removed.
	 */
	void removeListener(EventListener listener);
	
	/**
	 * The {@code parent} recurring event.
	 * @param event {@link Event} the event received
	 */
	void onEventReceived(Object sender, Event event);
}