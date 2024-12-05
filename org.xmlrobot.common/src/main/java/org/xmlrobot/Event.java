package org.xmlrobot;

/**
 * <img src="./doc-files/image.jpg" width="100">
 * <h1>org.xmlrobot.Event Class</h1>
 * <h2><i>Class implementation of an {@code event}</i></h2>
 */
public class Event implements java.io.Serializable {
	
    @java.io.Serial
	private static final long serialVersionUID = 4530123299546110604L;

    /**
     * The object on which the Event initially recurred.
     */
    transient Object source;
	
	public int getEventType() {
		return source.getEventType();
	}
	public Event(Object source) {
        if (source == null)
            throw new IllegalArgumentException("null source");
        this.source = source;
	}
    /**
     * Returns a String representation of this EventObject.
     * @return a String representation of this EventObject
     */
    public String toString() {
        return getClass().getName() + "[source=" + source + "]";
    }
}