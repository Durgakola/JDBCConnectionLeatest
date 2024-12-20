package com.neoteric.jdbcconnectionlatest.springioc;

public class Practice {
    public static void main(String[] args) {
        boolean a = true;
        int score = 800;
        int b = 5;
        int c = 100;
        int d = score;
        if (a == true) {
            d += (b * c);
            System.out.println(d);
        }
    }
}
