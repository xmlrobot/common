package org.xmlrobot.numbers;

import java.util.Enumeration;
import java.util.Objects;
import java.util.function.Consumer;

public interface Enumerator<E> extends Enumeration<E> {

    void remove();
    
    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasMoreElements())
            action.accept(nextElement());
    }
}