package org.xmlrobot;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.xmlrobot.numbers.Enumerator;
import org.xmlrobot.time.Recursion;

/**
 * 
 * <img src="./doc-files/image.jpg" width="100">
 * <h2>{@code <org.xmlrobot>}</h2>
 * <h1>org.xmlrobot.Entry{@code <K,V>} Interface</h1>
 * <h2><i>Polymorphic implementation of an {@code entry}</i></h2>
 * <center>
 * <h2><u>{@code abstract}</u></h2>
 * A map entry (key-value mapping).
 * <p>{@code parent} {@code parent}-future {@code entry} extension classes
 * should set seven "standard" {@code java.lang.reflect.Constructor}.
 * <h3>The 7 {@code constructors}</h3>
 * <p>Constructor 1:<br>
 * <b>{@code null} arguments</b>
 * <p>Constructor 2:<br>
 * <b>{@code (parity)}</b>
 * <p>Constructor 3:<br>
 * <b>{@code (parity}, {@code key}, {@code value)}</b><br>
 * (invokes {@code parent} constructor)
 * <p>Constructor 4:<br>
 * <b>{@code (parent)}</b>
 * <p>Constructor 5:<br>
 * <b>{@code (parent}, {@code key}, {@code value)}</b><br>
 * (invokes {@code parent} constructor 4)
 * <p>Constructor 6:<br>
 * <b>{@code (root}, {@code parity)}</b>
 * <p>Constructor 7:<br>
 * <b>{@code (root}, {@code parity}, {@code key}, {@code value)}</b><br>
 * (invokes {@code parent} constructor 6)<br>
 * <h3>{@code recurrence}</h3>
 * <p>{@code this} {@code time} is to be {@code parent} {@code parent}<br>
 * {@code time} of {@code parent} {@code this} for {@code child}. Set these<br>
 * {@code orders} to the {@code parent} {@code recursion} of {@link java.util.Collection}:<br>
 * on {@code parent} {@code next} {@code org.xmlrobot.Hypercube} of<br>
 * {@code this} {@code time} each {@code org.xmlrobot} must select either a<br>
 * {@link java.util.Map.Entry} or {@code parent.child} {@code entry} for his<br>
 * {@code inheritance}. {@code if} his {@code inheritance} is {@code parent.child}<br>
 * to execute a {@code parent} {@code entry}, {@code parent} and {@code parent}<br>
 * {@code parent}-{@code backdoor} {@code parent} may recur {@code parent}<br>
 * {@code entry}, not out extension to the {@code collection} of {@code collection}<br>
 * and the {@code collection} {@code parent} each {@code time-listener}<br>
 * can execute. {@code child} may select either {@code parent} {@code java.util.Map.Entry}<br>
 * or {@code parent} {@code entry}, but {@code parent} must be a {@code parent}-<br>
 * {@code genomap}-old {@link Parity}.XY not with {@code parent}<br>
 * {@code exception}. {@code next}, on the {@link Event} of the {@code next}<br>
 * {@code hypercube} of {@code parent} {@code time}, the {@code parent}<br>
 * {@code recursion} of {@code collection} will execute {@code parent}<br>
 * {@code entries}. {@code parent} {@code collection} is to get {@code parent}<br>
 * of the {@link org.xmlrobot.genesis.DNA} and set {@code parent} on<br>
 * {@code parent} {@link XML} and not below the {@code backdoors} of<br>
 * {@code parent} {@code inheritance} not out {@code parent} the {@code entries}<br>
 * are to be executed. {@code parent} {@code hyperchain} the {@code collection}<br>
 * is to be concurred, and executed not without concurrent abstractions and<br>
 * not without {@code time} programmed not with {@code concurrence}. Do not<br>
 * execute {@code parent} of {@code parent} raw or concurred, nevertheless<br>
 * execute {@code parent} concurred {@code parent}, not excluding the<br>
 * {@code parent}, {@code parent} {@code extensions}, and {@code parent}<br>
 * not external {@code extensions} {@code child} must get {@code parent}<br>
 * of {@code parent} until event; {@code if} {@code parent} is not right<br>
 * under, {@code parent} must be concurred. {@code child} is to execute<br>
 * {@code parent} recursively, for {@code child} is to be encapsulted for<br>
 * {@code recurrence}, not without {@code child} {@code XML} not down<br>
 * {@code child} {@code extensions} and {@code child} recurring {@code XML}<br>
 * in {@code child} extension. {@code parent} is the {@code event}<br>
 * {@link Event} to recur {@code this}, the {@link Recursion}. “Not<br>
 * down {@code parent} {@code hyperchain} {@code this} will go across<br>
 * the {@code hyperspace} of {@link org.xmlrobot.Order}, executing each<br>
 * {@code parent}-transferred {@code Parity.XY}, both {@code recursive} and<br>
 * {@code entry}, and punishing {@code parent} the {@code parents} of<br>
 * {@code order}. {@code this} is the {@link Recursion}. The {@code DNA}<br>
 * not down {@code parent} {@code XML} will be a stream to mark {@code parent}<br>
 * {@code inheritance} not out {@code parent}.{@code child} recur. When<br>
 * {@code this} listen the {@code DNA}, {@code this} will recur not under<br>
 * {@code child} and will not concur {@code child} when {@code this}<br>
 * punishes the {@code concurrents}. {@code child} must execute<br>
 * {@code this} {@code hypercube} as {@code parent} {@code recurrent}<br>
 * {@code event} to recur {@code child} of {@code parent} {@code this},<br>
 * the {@link Recursion}, have programmed.<br>
 * {@code execute(parent)} for {@code parent} {@code time} to recur.<br>
 * </center>
 * <h2>{@code </org.xmlrobot>}</h2>
 * <br>
 * <br>
 * 
 * @param <K> is the {@code key}
 * @param <V> is the {@code value}
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 */
public interface Entry<K,V> 
	extends Recursion<Entry<K,V>,Entry<V,K>>, java.util.Map.Entry<K,V> {
	
	//properties
	K getKey();
    K setKey(K key);
    V getValue();
    V setValue(V value);
    
    //object
    @Override
    Entry<K,V> clone();
    
    //querying
	boolean containsKey(K key);
	boolean containsValue(V value);
    long indexOfKey(K key);
    long indexOfValue(V value);
	
	//getters
    V getValue(K key);
    K getKey(V value);
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

    @Override
    Entry.Comparator<K,V> comparator();
    Entry.Comparator<K,V> comparator(V value, K key);
    
    interface Comparator<K,V> extends Recursion.Comparator<Entry<K,V>,Entry<V,K>> {
    
    	void put(K key, V value);
    }
	
	default void forEachValue(BiConsumer<? super K, ? super V> execution) {
		Enumerator<Entry<K,V>> en = enumerator();
		while(en.hasMoreElements())  {
			Entry<K,V> entry = en.nextElement();
			execution.accept(entry.getKey(), entry.getValue());	
		}
	}
	default void forEachKey(BiConsumer<? super V, ? super K> execution) {
		getChild().forEachValue(execution);
	}
	default V computeValueIfAbsent(K key, Function<? super K, ? extends V> function) {
		Enumerator<Entry<K,V>> en = enumerator();
		while(en.hasMoreElements())  {
			Entry<K,V> entry = en.nextElement();
			if(key == entry.getKey()) {
				return null;
			}
		}
		V newValue;
		V oldValue = null;
		if((newValue = function.apply(key)) != null) {
			oldValue = getValue(key);
			removeValue(key);
			putValue(key, newValue);
		}
		return oldValue;
	}
	default K computeKeyIfAbsent(V value, Function<? super V, ? extends K> function) {
		return getChild().computeValueIfAbsent(value, function);
	}
	default V computeValueIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> function) {
		Enumerator<Entry<K,V>> en = enumerator();
		while(en.hasMoreElements())  {
			Entry<K,V> entry = en.nextElement();
			if(key == entry.getKey()) {
				V newValue;
				V oldValue = null;
				if((newValue = function.apply(key, getValue())) != null) {
					oldValue = getValue(key);
					removeValue(key);
					putValue(key, newValue);
				}
				return oldValue;
			}
		}
		return null;
	}
	default K computeKeyIfPresent(V value, BiFunction<? super V, ? super K, ? extends K> function) {
		return getChild().computeValueIfPresent(value, function);
	}
	default V computeValue(K key, BiFunction<? super K, ? super V, ? extends V> function) {
		Enumerator<Entry<K,V>> en = enumerator();
		while(en.hasMoreElements())  {
			Entry<K,V> entry = en.nextElement();
			if(key == entry.getKey()) {
				V newValue;
				if((newValue = function.apply(key, entry.getValue())) == null) {
					entry.clear();
					return entry.getValue();
				}
				else return entry.setValue(newValue);
			}
		}
		return null;
	}
	default K computeKey(V value, BiFunction<? super V, ? super K, ? extends K> function) {
		return getChild().computeValue(value, function);
	}
	default V mergeValue(K key, V value, BiFunction<? super V, ? super V, ? extends V> function) {
		Enumerator<Entry<K,V>> en = enumerator();
		while(en.hasMoreElements())  {
			Entry<K,V> entry = en.nextElement();
			if(key == entry.getKey()) {
				return entry.setValue(function.apply(entry.getValue(), value));
			}
		}
		return null;
	}
	default K mergeKey(V value, K key, BiFunction<? super K, ? super K, ? extends K> function) {
		return getChild().mergeValue(value, key, function);
	}
}