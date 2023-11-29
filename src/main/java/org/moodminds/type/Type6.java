package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T6} constructor.
 *
 * @param <V1> the type of the parameter 1
 * @param <V2> the type of the parameter 2
 * @param <V3> the type of the parameter 3
 * @param <V4> the type of the parameter 4
 * @param <V5> the type of the parameter 5
 * @param <V6> the type of the parameter 6
 */
@FunctionalInterface
public interface Type6<V1, V2, V3, V4, V5, V6> {

    /**
     * Return an instance of parameterized {@link T6}.
     *
     * @return an instance of parameterized {@link T6}
     */
    T6<V1, V2, V3, V4, V5, V6> type();
}
