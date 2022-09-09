/**
 * Demonstrate Mockito and JUnit 5
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

package org.java.examples;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ExampleMocksTest {

    @Mock
    ExampleCode exampleCode;

    @Test
    public void containsHello_mock() {
        Mockito.when(exampleCode.containsHello(anyString())).thenReturn(true); // runs code
        assertTrue(exampleCode.containsHello("MockTest"));
    }

    @Test
    public void isNumberOdd_mock() {
        Mockito.doReturn(true).when(exampleCode).isNumberOdd(any()); // does not run code
        assertTrue(exampleCode.isNumberOdd(EnumExample.Four));
    }


}
