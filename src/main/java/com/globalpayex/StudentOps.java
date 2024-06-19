package com.globalpayex;

public class StudentOps {

    public static String studentDetails(String name, char gender, int age, int marks) {
        String result = "";
        return result = result + "Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Marks: " + marks;
    }
        public static char checkGrade(int marks) {
            if (marks <= 100 && marks >= 70) {
                return 'A';
            } else if (marks >= 60 && marks < 70) {
                return 'B';
            } else if (marks >= 40 && marks < 60) {
                return 'C';
            } else if (marks < 40 && marks >= 0) {
                return 'F';
            } else {
                return 'I';
            }
        }
}
