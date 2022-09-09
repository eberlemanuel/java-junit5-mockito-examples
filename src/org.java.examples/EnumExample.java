/**
 * Example enum to demonstrate parameterized tests with an EnumSource
 *
 * @author  ebeman12
 * @version 0.1
 * @date   09.09.2022
 */

package org.java.examples;

public enum EnumExample {

    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5);

    Integer num;

    EnumExample(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return this.num;
    }

}
