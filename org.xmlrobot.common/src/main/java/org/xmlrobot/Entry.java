package org.xmlrobot;

import org.xmlrobot.time.Recursion;

public interface Entry<K,V> extends Recursion<Entry<K,V>,Entry<V,K>>, 
	java.util.Map.Entry<K,V> {

}