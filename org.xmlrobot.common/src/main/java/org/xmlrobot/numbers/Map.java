package org.xmlrobot.numbers;

import java.util.Set;
import org.xmlrobot.Entry;

public interface Map<K,V> extends Set<Entry<K,V>> {
	
	Set<Entry<K,V>> entrySet();

	V put(K key, V value);
}