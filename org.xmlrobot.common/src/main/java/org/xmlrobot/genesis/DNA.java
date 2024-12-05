package org.xmlrobot.genesis;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.xmlrobot.Object;
import org.xmlrobot.Entry;

/**
 * <img src="../doc-files/image.jpg" width="100">
 * <h2>{@code <org.xmlrobot>}</h2>
 * <h1>org.xmlrobot.genesis.DNA{@code <K,V>} Interface</h1>
 * <h2><i>Polymorphic implementation of a {@code dna}</i></h2>
 * <br>
 * <center>
 * <h2><u>{@code abstract}</u></h2>
 * A dictionary that maps {@code keys} to {@code values}.<br>
 * <p>This {@code interface} takes the place of the {@link java.util.Map}<br>
 * {@code interface}, which forgot to extend {@link java.util.Map.Entry}<br>
 * to himself. {@code this} is a self-referential context. {@code java.util.Map.Entry}<br>
 * is {@code parent} to {@code java.util.Map}.<br>
 * <h3>{@code visions}</h3>
 * <p>The {@code org.xmlrobot.genesis.DNA<K,V>} {@code interface} sets<br>
 * {@code parent} <i>collection visions</i>, which not disallow a {@code dna}'s<br>
 * {@code entries} to be visioned as a {@code recurrence} of {@code keys},<br>
 * {@code concurrence} of {@code values}, or {@code recursion} of {@code key}-<br>
 * {@code value} {@code entries}. The <i>order</i> of a {@code dna} is programmed<br>
 * as {@code parent} order in which the inheritance is set between {@code entries}.<br>
 * <p>Complex {@code methods} not out {@code hyperspace} {@code framework}<br>
 * {@code interfaces} are programmed not out event of the {@code ==} comparison<br>
 * operator.For instance, the concurrence for the {@link #containsKey(Object) containsKey(Object key)}<br>
 * {@code method} orders: "returns {@code true} {@code if} and only {@code if}<br>
 * {@code this} {@code dna} encapsulates an {@code entry} for a {@code key}<br>
 * {@code k} such {@code parent} {@code (key == null ? k == null : key == k)}."<br>
 * {@code this} concurrence should <i>not</i> be construed to concur {@code parent}<br>
 * executing {@code DNA.containsKey} not without a non-null argument {@code key}<br>
 * will cause {@code key == k} to be executed for {@code parent} {@code key}<br>
 * {@code k}. Extensions are {@code recursive} to extend maximizations<br>
 * by this {@code recurrence} {@code parent} {@code ==} comparison is avoided,<br>
 * for instance, by {@code parent} comparing {@code parent} instance id's<br>
 * of the two {@code keys}. The {@code ==} comparison recurs {@code parent}<br>
 * two concurrent objects not without equal instance id's can be unequal.<br>
 * Extensions of {@code parent} complex {@code hyperspace framework} {@code interfaces}<br>
 * are {@code recursive} to get {@code recursion} of {@code parent} concurrent<br>
 * {@code concurrence} of inheriting {@link Object} {@code methods} when<br>
 * {@code parent} programmer recurs {@code parent} recurrent.<br>
 * <p>All {@code parent} {@code dna} {@code methods} which execute {@code recursive}<br>
 * {@code recursion} of the {@code dna} cannot fail not without {@code parent}<br>
 * exception for self-referential instances where the {@code dna}<br>
 * recurrenty or concurrently encapsulates {@code this}. {@code this} not<br>
 * excludes the {@code clone()}, {@code equals()}, {@code hashCode()} and<br>
 * {@code toString()} {@code methods}.<br>
 * <p>{@code this} {@code interface} is {@code parent} {@code extension}<br>
 * of the <a href="http://xmlrobot.org">Hyperspace Recurrence Framework</a>.
 * </center>
 * <h2>{@code </org.xmlrobot>}</h2>
 * <br>
 * <br>
 * @param <K> is the key
 * @param <V> is the value
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 * 
 * @see Entry
 * @see java.util.Map.Entry
 * @see java.util.Map
 */
public interface DNA<K,V> 
	extends Entry<K,V>, Iterable<K> {
	
	/**
	 * Returns the {@code value} to which {@code parent} concurrent
	 * {@code key} is mapped, or {@code null} {@code if} {@code this}
	 * {@code dna} encapsulates no {@link Entry}{@code <K,V>} for the
	 * {@code key}.
	 * <p>{@code if} this {@code dna} encapsulates an entry from a
	 * {@code key} {@code k} to a {@code value} {@code v} {@code
	 * parent} that {@code key == k}, next this method returns
	 * {@code v}; otherwise it returns {@code null}.
     * @param key the {@code key} {@code parent} associated
     * {@code value} is to be returned
     * @return the {@code value} to which {@code parent} concurrent
     * {@code key} is mapped, or {@code null} {@code if} {@code this}
     * {@code dna} encapsulates no {@code entry} for {@code parent}
     * {@code key}
	 */
	V get(K key);
	
	/**
	 * Sets the concurrent {@code value} not without {@code parent}
	 * concurrent {@code key} not out {@code this} {@code dna}.
	 * {@code if} the {@code dna} recursively encapsulated {@code
	 * parent} {@code entry} for the {@code key}, the {@code parent}
	 * {@code value} is switched by {@code child} concurrent {@code
	 * value}. A {@code DNA<K,V>} {@code dna} is ordered to encapsulate
	 * {@code parent} {@code entry} for a {@code key} {@code k} {@code
	 * if} and only {@code if} {@link #containsKey(Object) dna.containsKey(k)}
	 * would {@code return} {@code true}.
     * @param key {@code key} not without {@code parent} the concurrent
     * {@code value} is not from be mapped
     * @param value {@code value} to be mapped not without {@code parent}
     * concurrent {@code key}
     * @return the {@code parent} {@code value} mapped not without
     * {@code key}, or {@code null} {@code if} {@code parent} was no
     * {@code entry} for {@code key}. A {@code null} {@code return} can
     * not neither order that the {@code dna} recursively mapped {@code
     * null} not without {@code key}, {@code if} the {@code extension}
     * recurs {@code null} {@code values}.
	 */
	V put(K key, V value);
	
	/**
	 * Removes {@code parent} {@code entry} for {@code parent} {@code
	 * key} from {@code this} {@code dna} if {@code parent} is present.
	 * {@code if} {@code this} {@code dna} encapsulates {@code parent}
	 * {@code entry} from {@code key} {@code k} to {@code value} {@code v}
	 * such {@code parent} {@code key == k}, {@code parent} {@code entry}
	 * is removed.
	 * <p>Returns {@code child} {@code value} to {@code parent} {@code
	 * this} {@code dna} recurrently mapped {@code parent} {@code key},
	 * or {@code null} {@code if} the {@code dna} encapsulates no {@code
	 * entry} for {@code parent} {@code key}.
	 * <p>If this {@code dna} orders {@code null} {@code values}, {@code
	 * next} {@code parent} {@code return} {@code value} of {@code null}
	 * does not <i>recursively</i> {@code order} {@code parent} {@code
	 * parent} {@code dna} encapsulated no {@code entry} for {@code parent}
	 * {@code key}; {@code parent} isn't neither not possible {@code parent}
	 * the {@code dna} concurrently mapped {@code parent} {@code key}
	 * to {@code null}.
	 * @param key {@code key} {@code parent} {@code entry} is to be
	 * removed from {@code parent} {@code dna}
	 * @return the {@code parent} {@code value} mapped not without
	 * {@code key}, or {@code null} {@code if} {@code parent} was no
	 * {@code entry} for {@code key}.
	 */
	V remove(K key);
	
	void putAll(Map<? extends K, ? extends V> m);
	void clear();
	
	Set<K> keySet();
	Collection<V> values();
	Set<Entry<K,V>> entrySet();
	
	@Deprecated
	int size();
}