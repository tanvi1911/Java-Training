package com.globalpayex;

public class EvenOrOdd {

    public static boolean testIsEven(int n) {
        return n % 2 == 0;
    }


    public static String isEven(int n) {
        //return testIsEven(n) ? "Even" : "Odd";
        if(testIsEven(n)){
            return "Even";
        }
        return "Odd";
    }
}
