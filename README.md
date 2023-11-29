# Generic type transfer constructs

**Types** comprises a collection of functional interfaces which can be used as parameterized type definition constructs.

## In a Nutshell

**Types** provides parameterized type classes - `T<V>`, `T2<V1, V2>`, ... up to `T8<V1, V2, ..., V8>` and their
functional definition interfaces - `Type1<V>`, `Type2<V1, V2>`, ... up to `Type8<V1, V2, ..., V8>`. These functional interfaces
can be used in parameterized methods and defined as references when passed as arguments e.g., `T<String>::new`, `T2<Integer, Long>::new`.

## Brief overview

The main objectives of the **Types** are:

* To transfer a multi-level generic type when you cannot use `*.class` (e.g., `List<String>.class`).
* To transfer multiple any nesting level generic types (e.g., `T2<List<Integer>, Long>::new`).
* To allow method callers to pass only few type parameters instead of declaring all method type parameters
  explicitly (e.g., `instance.<[V1,..V8]>method(.., ..)`).


**Let's examine the usage of the **Types** by examples**:

```java
import org.moodminds.type.*;
import org.type.*;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static java.lang.String.join;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class Sample {

    public void sample() {

        // transfer a multi-level generic type when you cannot use .class (e.g., List<String>.class).
        int len = sample(T<List<String>>::new, strings -> join(",", strings))
                .apply(asList("a", "b", "c")).length();

        // transfer multiple any nesting level generic types - List<String> and Long.
        int val = sample(T2<List<String>, Long>::new, (strings, l) -> l)
                .apply(emptyList(), 10L).intValue();

        // transfer type(s) when you cannot or don't want to declare all explicit method type parameters (e.g., this.<[V1,..V8]>sample(.., ..)).
        String str = sample(T3<Integer, String, Long>::new, (i, s) -> i + s)
                .apply(1, "a").toUpperCase();
    }

    // allow method caller to pass only 1 type parameters instead of 2 in explicit method call declaration
    public <V1, V2> Function<V1, V2> sample(Type1<V1> type, Function<V1, V2> f) {
        return f;
    }

    // allow method caller to pass only 2 type parameters instead of 3 in explicit method call declaration
    public <V1, V2, V3> BiFunction<V1, V2, V3> sample(Type2<V1, V2> type, BiFunction<V1, V2, V3> f) {
        return f;
    }

    // allow method caller to pass only 3 type parameters instead of 8 in explicit method call declaration
    public <V1, V2, V3, V4, V5, V6, V7, V8> BiFunction<V1, V2, V3> sample(Type3<V1, V2, V4> type, BiFunction<V1, V2, V3> f) {
        return f;
    }
}
```

## Getting Started

Include **Types** in your project by adding the dependency.

## Maven configuration

Artifacts can be found on [Maven Central](https://search.maven.org/) after publication.

```xml

<dependency>
  <groupId>org.moodminds.types</groupId>
  <artifactId>types</artifactId>
  <version>${version}</version>
</dependency>
```

## Building from Source

You may need to build from source to use **Types** (until it is in Maven Central) with Maven and JDK 1.8 at least.

## License
This project is going to be released under version 2.0 of the [Apache License][l].

[l]: https://www.apache.org/licenses/LICENSE-2.0