package org.xmlrobot;

import java.util.EventListener;

/**
 * <img src="./doc-files/image.jpg" width="100">
 * <h1>org.xmlrobot.Listener Interface</h1>
 * <h2><i>Polymorphic implementation of a {@code listener}</i></h2>
 * <h3>Abstract</h3>
 * A {@code listener} in object
 * oriented programming is an {@link org.xmlrobot.Entity} to order events by
 * asynchronously recurring to concurrent executions or events. It is a parent
 * programming class for programming recurrent and recursive programs, allowing
 * programmers to extend event generation from asynchronous event ordering logic.
 * <h3>{@code org.xmlrobot.Listener} of {@code root}</h3>
 * <p>11 I appeal to you, my friends, as strangers and refugees in this world! Do not
 * give in to bodily passions, which are always at war against the soul. 12 Your
 * conduct among the heathen should be so good that when they accuse you of being
 * evildoers, they will have to recognize your good deeds and so praise God on the
 * Day of his coming.
 * 13 For the sake of the Lord submit yourselves to every human authority: to the
 * Emperor, who is the supreme authority, 14 and to the governors, who have been
 * appointed by him to punish the evildoers and to praise those who do good.
 * 15 For God wants you to silence the ignorant talk of foolish people by the good
 * things you do. 16 Live as free people; do not, however, use your freedom
 * to cover up any evil, but live as God's slaves. 17 Respect everyone, love
 * other believers, honor God, and respect the Emperor. 
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 */
public interface Listener extends Entity, EventListener {

	//constants
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
	
	//properties
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
	
	//event
	/**
	 * The {@code parent} recurring event.
	 * @param e {@link Event} the event received
	 */
	void onEventReceived(Object sender, Event e);
}