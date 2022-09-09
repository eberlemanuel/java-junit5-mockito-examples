/**
 * Thrown if a zero division will happen
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

package org.java.examples;

public class ZeroDivisionException extends Exception {
    public ZeroDivisionException(String msg) {
        super(msg);
    }
}
