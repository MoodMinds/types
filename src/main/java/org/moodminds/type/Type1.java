package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T} constructor.
 *
 * @param <V> the type of the parameter
 */
@FunctionalInterface
public interface Type1<V> {

    /**
     * Return an instance of parameterized {@link T}.
     *
     * @return an instance of parameterized {@link T}
     */
    T<V> type();
}
