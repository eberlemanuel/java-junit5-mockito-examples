/**
 * Example class to demonstrate parameterized tests
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

package org.java.examples;

public class ExampleCode {

    public ExampleCode() {}

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static boolean isInteger(Object obj) {
        return obj instanceof Integer;
    }

    public static boolean isNumberEven(Integer num) {
        return (num % 2 == 0);
    }

    public static Integer doDivisionBetweenTwoNumbers(Integer numOne, Integer numTwo) throws ZeroDivisionException {
        if (numTwo == 0) {
            throw new ZeroDivisionException("Division by 0");
        }
        return (numOne/numTwo);
    }

    public boolean containsHello(String value) {
        return value.contains("Hello");
    }

    public boolean isNumberOdd(EnumExample enumExample) {
        return (enumExample.getNum() % 2 == 1);
    }

}

