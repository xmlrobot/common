package org.xmlrobot.genesis;

import java.util.Collection;

import org.xmlrobot.Entry;

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