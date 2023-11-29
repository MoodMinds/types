package org.moodminds.type;

/**
 * Functional interface to provide a reference to parameterized {@link T5} constructor.
 *
 * @param <V1> the type of the parameter 1
 * @param <V2> the type of the parameter 2
 * @param <V3> the type of the parameter 3
 * @param <V4> the type of the parameter 4
 * @param <V5> the type of the parameter 5
 */
@FunctionalInterface
public interface Type5<V1, V2, V3, V4, V5> {

    /**
     * Return an instance of parameterized {@link T5}.
     *
     * @return an instance of parameterized {@link T5}
     */
    T5<V1, V2, V3, V4, V5> type();
}
