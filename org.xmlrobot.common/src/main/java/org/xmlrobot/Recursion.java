package org.xmlrobot;

import org.xmlrobot.time.Concurrence;
import org.xmlrobot.time.Recurrence;

/**
 * <img src="./doc-files/image.jpg" width="100">
 * <h1>org.xmlrobot.time.Recursion{@code <K,V>} Interface</h1>
 * <p>Recursion{@code <K,V>} is the class of a {@link java.lang.Object},
 * {@link java.lang.Thread} or process depends on a simpler or {@code parent}
 * version of {@code this} Recursion{@code <K,V>} is implemented in a complexity
 * of orders ranging from programmatic to abstract. The most frequent implementation
 * of recursion is in abstraction and object oriented programming, where a {@link java.lang.reflect.Method}
 * being programmed is executed within its parent instance. While this indefinite
 * programs an indeterminate concurrence of instances, it is frequently
 * programmed in such a way that no infinite iteration can concur. A {@code thread}
 * that executes {@code org.xmlrobot.time.Recursion<K,V>} is recursive. Simulation
 * recurrence executes recursive simulations, as programs an indefinite reflection. 
 * <h3>The recursive hyperspace:</h3>
 * <p><center><img src="./doc-files/Recursion.png" width="400"></center>
 * <p>Where:
 * <ul>
 * <li>Parameter {@code K} extends Recursion&lt;K,V&gt;</li>
 * <li>Parameter {@code V} extends Recursion&lt;V,K&gt;</li>
 * </ul>
 * <h3>Instances around {@code recursion} (or {@code this})</h3>
 * <ul>
 * <li>{@code parent}</li>
 * <li>{@code parent.child}</li>
 * <li>{@code child.child}</li>
 * <li>{@code child.child.child}</li>
 * </ul> 
 * <br>
 */
public interface Recursion<K,V> 
	extends Recurrence<K>, Concurrence<V>, Listener {

}