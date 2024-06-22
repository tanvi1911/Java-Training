package com.globalpayex;

import java.util.Arrays;
import java.util.HashSet;

public class PlaySet {

    public static void main(String[] args) {

        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Tanvi");
        uniqueNames.add("Riya");
        uniqueNames.add("Tanvi");

        System.out.println(uniqueNames);
        var list = Arrays.asList(10,3,5,8,3,8,6,8,2,10,5,3,7);
        HashSet<Integer> uniqueMarks = new HashSet<>(list);
        System.out.println(uniqueMarks);

        for (int num : uniqueMarks){
            System.out.println(num);
        }

        var nDiva = Arrays.asList(6, 5, 8);
        var nDivb = Arrays.asList(5, 9, 8);
        HashSet<Integer> divAMarks = new HashSet<>(nDiva);
        HashSet<Integer> divBMarks = new HashSet<>(nDivb);

        divAMarks.retainAll(divBMarks);
        System.out.println(divAMarks);

        HashSet<Integer> s1 = new HashSet<>(nDiva);
        HashSet<Integer> s2 = new HashSet<>(nDivb);

        s1.addAll(s2);
        System.out.println(s1);

    }

}
