package com.globalpayex;

import java.util.Arrays;

public class PlayArrayList {

    public static void main(String[] args) {

        var nos = Arrays.asList(11,16,5,2,88,4);

//        for(int element: nos){
//            if(element%2 == 0 && element > 4){
//                System.out.println(element);
//            }
//        }

//        nos.forEach(element -> {
//            if(element%2 == 0 && element > 4){
//                System.out.println(element);
//            }
//        });

        var names = Arrays.asList("Isha", "Saurav", "Riya", "Prathna");
        names.forEach(name -> {
            if(name.length() >= 5){
                System.out.println(name.toUpperCase());
            }
            else{
                System.out.println(name.toLowerCase());
            }
        });
    }
}
