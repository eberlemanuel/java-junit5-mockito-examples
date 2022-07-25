package org.java.examples;

import java.util.stream.Stream;

public class ExampleParams {

    static Stream<Integer> setOfNumbers() {
        return Stream.of(1, 2, 3, 4, 5);
    }
    static Stream<String> blankStrings() {
        return Stream.of(null, "", "  ");
    }

}
