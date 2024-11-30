package org.xmlrobot;

import java.util.EventObject;

public class Event extends EventObject {

	private static final long serialVersionUID = 4530123299546110604L;

	int eventType;
	
	public int getEventType() {
		return eventType;
	}

	public Event(Object source, int eventType) {
		super(source);
		this.eventType = eventType;
	}
}