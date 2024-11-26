package org.xmlrobot.time;

import org.xmlrobot.TimeListener;

public interface Recursion<K,V> extends Recurrence<K>, Concurrence<V>, TimeListener<K,V> {

}
