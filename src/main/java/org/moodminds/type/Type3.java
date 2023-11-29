package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T3} constructor.
 *
 * @param <V1> the type of the parameter 1
 * @param <V2> the type of the parameter 2
 * @param <V3> the type of the parameter 3
 */
@FunctionalInterface
public interface Type3<V1, V2, V3> {

    /**
     * Return an instance of parameterized {@link T3}.
     *
     * @return an instance of parameterized {@link T3}
     */
    T3<V1, V2, V3> type();
}
