package com.globalpayex;

public class PrintEven {

    public static String printEven(int n) {
        String result = "";
        for(int i = 0; i <= n; i += 2){
            result = result + i;
            if(i < n - 1){
                result = result + ",";
            }
        }
        return result;
    }
}
