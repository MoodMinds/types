package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T2} constructor.
 *
 * @param <V1> the type of the parameter 1
 * @param <V2> the type of the parameter 2
 */
@FunctionalInterface
public interface Type2<V1, V2> {

    /**
     * Return an instance of parameterized {@link T2}.
     *
     * @return an instance of parameterized {@link T2}
     */
    T2<V1, V2> type();
}
