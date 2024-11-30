package org.xmlrobot.genesis;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.xmlrobot.Entry;

public interface DNA<K,V> 
	extends Entry<K,V>, java.util.Map<K,V>, Iterable<K> {

	boolean containsKey(Object key);
	boolean containsValue(Object value);
	V get(Object key);
	V put(K key, V value);
	V remove(Object key);
	void putAll(Map<? extends K, ? extends V> m);
	void clear();
	Set<K> keySet();
	Collection<V> values();
	Set<Map.Entry<K, V>> entrySet();
	
	@Deprecated
	int size();
}