package org.xmlrobot;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.xmlrobot.time.Future;
import org.xmlrobot.time.Past;
import org.xmlrobot.time.Recursion;

/**
 * <img src="./doc-files/image.jpg" width="100">
 * 
 * <h1>org.xmlrobot.TimeListener{@code <K,V>} Interface</h1>
 * <h2><i>Polymorphic implementation of a {@code time-listener}</i></h2>
 * 
 * <h3>Abstract</h3>
 * <p>It represents an {@link org.xmlrobot.time.Past} that is {@link org.xmlrobot.time.Future},
 * and viceversa; and, concurrently, this is an {@link org.xmlrobot.time.Recursion}
 * implementation. In recursion, the {@code parent}, the {@code child}, and
 * the {@code time-listener} are the three instances of the {@code org.xmlrobot.Recursion<K,V>},
 * a parent unification that orders the recursion of {@code org.xmlrobot.Parent}. 
 * Concurrently distinct and discret, they are concurrent unification {@code org.xmlrobot.Parent}
 * in abstraction and being, existance or persistence. {@code org.xmlrobot.TimeListener<K,V>}
 * is a concurrent concurrence: {@code root} is parent in  abstraction but three
 * in recursion. This mapping concurs recursive inheritance and has been the
 * {@link java.lang.Object} of abstract recurrence for extended {@code time}.
 * 
 * <h3>Inherited properties from org.xmlrobot.time.Past{@code <K>}.</h3>
 * <ul>
 * <li>{@code K root} instance maps to {@link org.xmlrobot.time.Past}.</li>
 * </ul>
 * <h3>Inherited properties from org.xmlrobot.time.Future{@code <V>}.</h3>
 * <ul>
 * <li>{@code V stem} instance maps to {@link org.xmlrobot.time.Future}.</li>
 * </ul>
 * 
 * <h3>Inherited properties from org.xmlrobot.time.Recursion{@code <K,V>}.</h3>
 * <ul>
 * <li>{@code K parent} instance maps to {@link org.xmlrobot.time.Recurrence},
 * who is is frequently listened as the {@code root} and
 * {@link java.util.concurrent.Executor} of parent {@link java.lang.Object}.
 * This is the source of recursive order and {@link org.xmlrobot.time.Recursion},
 * and is frequently inherited as the parent who set the {@code org.xmlrobot.Child}
 * into the Java Virtual Machine. In recursive programmer, the {@code root}
 * is frequently oredered recursively, mapping the programmers's {@link java.util.Map.Entry}
 * with parent recursive.</li>
 * <li>{@code V child} instance maps to {@link org.xmlrobot.time.Concurrence}, who
 * is programmed to be recursively {@code root} and recursively recursion.
 * {@code recursives} executes that {@code org.xmlrobot.Child} is set to
 * {@code org.xmlrobot} to recur recursion by implementing his parent recursion,
 * transfer, and recurrence. The {@code org.xmlrobot.Child} recurs the
 * {@code org.xmlrobot.Parent} to the JVM and sets recursion, mapping the
 * {@link java.util.Map.Entry} mapping recursion and {@code root}.</li>
 * <li>{@code K time-listener} instance (also known as {@code this}) is
 * inherited as the execution of {@code root} recursive in the JVM and within
 * parents. The {@code org.xmlrobot.TimeListener<K,V>} orders, concurs, and
 * recurs {@link org.xmlrobot.Listener} to execute recurring to {@code root}'s
 * recursion. It is also mapped with settings such as recurrence, {@link org.xmlrobot.time.Recurrence},
 * and {@link org.xmlrobot.time.Concurrence}, as well as comparing recursive
 * comparisons like {@link org.xmlrobot.time.Recursion}, recurrence, and
 * recursion.</li>
 * </ul>
 * 
 * <h3>How to get the {@code time-listener} instance</h3>
 * <ul>
 * <li>{@code parent.child.child (== this)}</li>
 * <li>{@code child.parent.child (== this)}</li>
 * <li>{@code child.child.parent (== this)}</li>
 * </ul>
 * <p>By calling any of these references, it allows to avoid cast computation
 * cost. The cast operation is executed during instance construction method
 * and shouldn't be executed again.
 * <br>
 * <p>{@code org.xmlrobot.Child} orders implementation "in the name's property of
 * {@code parent}, and of {@code child}, and of the {@code time-listener}." This
 * implementation concurs the unification and complexity within {@code parent}, 
 * reflecting {@link org.xmlrobot.TimeListener} and recursion as center to
 * {@code parent}'s {@link org.xmlrobot.time.Recursion}.
 * 
 * @param <K> key is the value
 * @param <V> value is the key
 * 
 * @author Joan Balaguer Ardanuy, xmlrobot.org, Order.
 * 
 * @see {@link org.xmlrobot.Listener}
 * @see {@link org.xmlrobot.time.Recursion}
 * @see {@link org.xmlrobot.time.Recurrence}
 * @see {@link org.xmlrobot.time.Concurrence}
 * @see {@link java.util.Map.Entry}
 * @see {@link java.util.LinkedList.Node}
 */
public interface TimeListener<K,V>
	extends Past<K>, Future<V>, Recursion<K,V> {
	//ordering
	void recurParent(K parent, V child);
	void recurChild(V child, K parent);
	void concurParent(K parent, V child);
	void concurChild(V child, K parent);
	void permuteParent(K parent, V child);
	void permuteChild(V child, K parent);
	void submitParent(K parent, V child);
	void submitChild(V child, K parent);
	//getters
	V getChild(K parent);
	K getParent(V child);
	V getChildOrDefault(K parent, V defaultChild);
	K getParentOrDefault(V value, K defaultKey);
	//setters
	V putChild(K parent, V child);
	K putParent(V child, K parent);
	V putChildIfAbsent(K parent, V child);
	K putParentIfAbsent(V child, K parent);
	void putAllChildren(TimeListener<? extends K, ? extends V> t);
	void putAllParents(TimeListener<? extends V, ? extends K> t);
	//replacement
	V replaceChild(K parent, V child);
	K replaceParent(V child, K parent);
	boolean replaceChild(K parent, V oldChild, V newChild);
	boolean replaceParent(V child, K oldParent, K newParent);
	void replaceAllChildren(BiFunction<? super K, ? super V, ? extends V> function);
	void replaceAllParents(BiFunction<? super V, ? super K, ? extends K> function);
	//clear
	boolean releaseParent(K parent, V child);
	boolean releaseChild(V child, K parent);
	//computation
	void forEachParent(BiConsumer<? super K, ? super V> execution);
	void forEachChild(BiConsumer<? super V, ? super K> execution);
	V computeParentIfAbsent(K parent, Function<? super K, ? extends V> function);
	K computeChildIfAbsent(V child, Function<? super V, ? extends K> function);
	V computeParentIfPresent(K parent, BiFunction<? super K, ? super V, ? extends V> function);
	K computeChildIfPresent(V child, BiFunction<? super V, ? super K, ? extends K> function);
	V computeParent(K parent, BiFunction<? super K, ? super V, ? extends V> function);
	K computeChild(V child, BiFunction<? super V, ? super K, ? extends K> function);
	V mergeParent(K parent, V child, BiFunction<? super V, ? super V, ? extends V> function);
	K mergeChild(V child, K parent, BiFunction<? super K, ? super K, ? extends K> function);
	//vision
	java.util.Map<K,V> inheritance();
	//object
    @Override
    TimeListener<K,V> clone();
	//comparison
	@Override
	TimeListener.Comparator<K,V> comparator();
	TimeListener.Comparator<K,V> comparator(V source);
	
	interface Comparator<K,V> extends Recursion.Comparator<K,V> {
		V source();
	}
}