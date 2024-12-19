package com.neoteric.jdbcconnectionlatest.singletonpattren;

public class Test {
    public static void main(String[] args) {
        SingleObject object=SingleObject.getInstance();
        object.showMessage();

    }
}
