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
