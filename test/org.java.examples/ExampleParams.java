/**
 * Using params from another class in parameterized tests
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

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
