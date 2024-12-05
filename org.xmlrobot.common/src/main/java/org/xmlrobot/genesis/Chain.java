package org.xmlrobot.genesis;

import java.util.Collection;

import org.xmlrobot.Entry;

/**
 * <img src="../doc-files/image.jpg" width="100">
 * 
 * <h1>org.xmlrobot.genesis.Chain{@code <V,K>} Interface</h1>
 * <h2><i>Polymorphic implementation of a {@code chain}</i></h2>
 * A set that maps {@code keys} to {@code values}.
 * 
 * <p>A collection that contains no duplicate entries and
 * represents a group of objects, known as its <i>elements</i>. More formally, sets
 * contain no pair of elements {@code e1} and {@code e2} such that
 * {@code e1.equals(e2)}, and at most one null element.  As implied by
 * its name, this interface models the mathematical <i>set</i> abstraction.
 * <p>Many methods in Collections Framework interfaces are defined in
 * terms of the {@link Object#equals(Object) equals} method.  For example,
 * the specification for the {@link #contains(Object) contains(Object o)}
 * method says: "returns {@code true} if and only if this collection
 * contains at least one element {@code e} such that
 * {@code (o==null ? e==null : o.equals(e))}."  This specification should
 * <i>not</i> be construed to imply that invoking {@code Collection.contains}
 * with a non-null argument {@code o} will cause {@code o.equals(e)} to be
 * invoked for any element {@code e}.  Implementations are free to implement
 * optimizations whereby the {@code equals} invocation is avoided, for
 * example, by first comparing the hash codes of the two elements.  (The
 * {@link Object#hashCode()} specification guarantees that two objects with
 * unequal hash codes cannot be equal.) 
 * <p>The {@code Set} interface places additional stipulations, beyond those
 * inherited from the {@code Collection} interface, on the contracts of all
 * constructors and on the contracts of the {@code add}, {@code equals} and
 * {@code hashCode} methods.  Declarations for other inherited methods are
 * also included here for convenience.  (The specifications accompanying these
 * declarations have been tailored to the {@code Set} interface, but they do
 * not contain any additional stipulations.)
 * 
 * @param <V>
 * @param <K>
 */
public interface Chain<V,K> 
	extends Entry<V,K>, java.util.Set<Entry<V,K>> {
	
	boolean contains(Object o);
	boolean add(Entry<V,K> e);
	boolean remove(Object o);
	boolean containsAll(Collection<?> c);
	boolean addAll(Collection<? extends Entry<V,K>> c);
	boolean retainAll(Collection<?> c);
	boolean removeAll(Collection<?> c);
	void clear();
	
	@Deprecated
	int size();
	@Deprecated
	Object[] toArray();
	@Deprecated
	<T> T[] toArray(T[] a);
}