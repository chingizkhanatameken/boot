package com.arocketman.github;

public class Tester {
    public static void main(String[] args) {
        String string = "AWD%20asd";
        if (string.contains("%20"))
                string = "2";
        System.out.println(string);
    }
}
