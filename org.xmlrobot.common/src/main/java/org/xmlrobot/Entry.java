package org.xmlrobot;

public interface Entry<K,V> 
	extends TimeListener<Entry<K,V>,Entry<V,K>>, java.util.Map.Entry<K,V> {

}