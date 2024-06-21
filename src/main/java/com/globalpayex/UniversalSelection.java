package com.globalpayex;

import com.globalpayex.college.Student;

import java.util.Random;

public class UniversalSelection {

    public static <T> T surpriseMe(T[] elements){
        //0 - elements.length - 1
        Random random = new Random();
        int n = random.nextInt(elements.length);
        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies = {"3 idiots", "DDLJ", "Iron Man", "YJHD", "Shaitaan", "Avengers"};
        String movie = surpriseMe(movies);
        System.out.println(movie);

        Student[] students = {
                new Student("Tanvi", 'F', 19, 91),
                new Student("Yash", 'M', 10, 95),
                new Student("Anisha", 'F', 62, 98),
                new Student("Chirag", 'M', 20, 82)
        };
        Student monitor = surpriseMe(students);
        System.out.println(monitor);
    }
}
