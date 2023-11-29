package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T4} constructor.
 *
 * @param <V1> the type of the parameter 1
 * @param <V2> the type of the parameter 2
 * @param <V3> the type of the parameter 3
 * @param <V4> the type of the parameter 4
 */
@FunctionalInterface
public interface Type4<V1, V2, V3, V4> {

    /**
     * Return an instance of parameterized {@link T4}.
     *
     * @return an instance of parameterized {@link T4}
     */
    T4<V1, V2, V3, V4> type();
}
