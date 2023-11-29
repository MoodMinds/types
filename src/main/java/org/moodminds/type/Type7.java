package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T7} constructor.
 *
 * @param <V1> the type of the parameter 1
 * @param <V2> the type of the parameter 2
 * @param <V3> the type of the parameter 3
 * @param <V4> the type of the parameter 4
 * @param <V5> the type of the parameter 5
 * @param <V6> the type of the parameter 6
 * @param <V7> the type of the parameter 7
 */
@FunctionalInterface
public interface Type7<V1, V2, V3, V4, V5, V6, V7> {

    /**
     * Return an instance of parameterized {@link T7}.
     *
     * @return an instance of parameterized {@link T7}
     */
    T7<V1, V2, V3, V4, V5, V6, V7> type();
}
