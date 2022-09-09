/**
 * Demonstrates JUnit 5 functionalities
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

package org.java.examples;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Example test class with new junit5 functionalities")
public class ExampleTest {

    @ParameterizedTest
    @NullAndEmptySource
    public void isBlank_ShouldReturnTrueForNullAndEmptyStrings(String input) {
        assertTrue(ExampleCode.isBlank(input));
    }

    @DisplayName("Test case to check if isBlank return true for null and empty strings")
    @ParameterizedTest(name = "Test Case: {index} - Input: {0}")
    @MethodSource("org.java.examples.ExampleParams#blankStrings")
    public void isBlank_ShouldReturnTrueForNullAndEmptyStringsMethodSource(String input) {
        assertTrue(ExampleCode.isBlank(input));
    }

    @ParameterizedTest(name = "Test Case: {index} - numOne={0}, numTwo={1}, result={2}")
    @CsvSource({"2, 1, 2", "10, 2, 5"}) // use [] instead of {} for Groovy
    @Fast
    public void doDivisionBetweenTwoNumbers_ShouldReturnResultCsvSource(Integer numOne, Integer numTwo, Integer result)
            throws ZeroDivisionException {
        assertEquals(result, ExampleCode.doDivisionBetweenTwoNumbers(numOne, numTwo));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    @Fast
    public void doDivisionBetweenTwoNumbers_ShouldThrowException(Integer numTwo) {
        ZeroDivisionException thrown = Assertions.assertThrows(ZeroDivisionException.class, () -> {
                ExampleCode.doDivisionBetweenTwoNumbers(5, numTwo);
        }, "Expected ZeroDivisionException");
        assertTrue(thrown.getMessage().contains("Division by 0"));
    }

    @Disabled("Disabled due to bugs")
    @Test
    public void disabledTestCase() {
        assertTrue(true);
    }

    @Disabled("Disabled due to bugs")
    @ParameterizedTest
    @EnumSource(EnumExample.class)
    public void isNumberEven_ShouldReturnTrueIfNumIsEven(EnumExample enumExample) {
        assertTrue(ExampleCode.isNumberEven(enumExample.getNum()));
    }

    @ParameterizedTest
    @EnumSource(EnumExample.class)
    public void isNumberEven_ShouldReturnTrueIfNumIsEvenWithAssumptions(EnumExample enumExample) {
        assumeTrue(ExampleCode.isNumberEven(enumExample.getNum()));
        assertTrue(ExampleCode.isNumberEven(enumExample.getNum()));
    }

    @ParameterizedTest
    @EnumSource(value = EnumExample.class, names = {"One", "Three", "Five"}, mode = EnumSource.Mode.EXCLUDE)
    public void isNumberEven_ShouldReturnTrueIfNumIsEvenWithExclusion(EnumExample enumExample) {
        assertTrue(ExampleCode.isNumberEven(enumExample.getNum()));
    }

    @Test
    @EnabledIf("isExecutedOnProductionServer")
    public void testCondition_enabled() {
        assertTrue(true);
    }

    @Test
    @DisabledIf("isExecutedOnProductionServer")
    public void testCondition_disabled() {
        assertTrue(true);
    }

    public boolean isExecutedOnProductionServer() {
        return true;
    }

    @RepeatedTest(5)
    @Test
    public void repeatedTest() {
        assertTrue(true);
    }

}
