package org.xmlrobot;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Entry<K,V> 
	extends TimeListener<Entry<K,V>,Entry<V,K>>, java.util.Map.Entry<K,V> {
	
	//properties
	K getKey();
    K setKey(K key);
    V getValue();
    V setValue(V value);
    
    //object
    @Override
    Entry<K,V> clone();
    
    //querying
	boolean containsKey(Object key);
	boolean containsValue(Object value);
	@Deprecated
    int indexOfKey(K key);
	@Deprecated
	int indexOfValue(V value);	
	
	//getters
    V getValue(Object key);
    K getKey(Object value);
    V getValueOrDefault(K key, V defaultValue);
    K getKeyOrDefault(V value, K defaultKey);
    Entry<K,V> getParentByKey(K key);
    Entry<V,K> getChildByValue(V value);	
    
    //setters
	Entry<K,V> putValue(K key, V value);
	Entry<V,K> putKey(V value, K key);
	Entry<K,V> putValueIfAbsent(K key, V value);
	Entry<V,K> putKeyIfAbsent(V value, K key);
	
	//replacement
	V replaceValue(K key, V value);
	K replaceKey(V value, K key);
	boolean replaceValue(K key, V oldValue, V newValue);
	boolean replaceKey(V value, K oldKey, K newKey);
	void replaceAllValues(BiFunction<? super K, ? super V, ? extends V> function);
	void replaceAllKeys(BiFunction<? super V, ? super K, ? extends K> function);
	
	//clear
	V removeValue(K key);
	K removeKey(V key);
	boolean removeValue(K key, V value);
	boolean removeKey(V value, K key);
	
	//computation
	void forEachValue(BiConsumer<? super K, ? super V> execution);
	void forEachKey(BiConsumer<? super V, ? super K> execution);
	V computeValueIfAbsent(K key, Function<? super K, ? extends V> function);
	K computeKeyIfAbsent(V value, Function<? super V, ? extends K> function);
	V computeValueIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> function);
	K computeKeyIfPresent(V value, BiFunction<? super V, ? super K, ? extends K> function);
	V computeValue(K key, BiFunction<? super K, ? super V, ? extends V> function);
	K computeKey(V value, BiFunction<? super V, ? super K, ? extends K> function);
	V mergeValue(K key, V value, BiFunction<? super V, ? super V, ? extends V> function);
	K mergeKey(V value, K key, BiFunction<? super K, ? super K, ? extends K> function);

    @Override
    Entry.Comparator<K,V> comparator();
    Entry.Comparator<K,V> comparator(V value, K key);
    
    interface Comparator<K,V> extends TimeListener.Comparator<Entry<K,V>,Entry<V,K>> {
    	
    }
}