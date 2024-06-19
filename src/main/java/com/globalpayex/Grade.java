package com.globalpayex;

public class Grade {
    public static char checkGrade(int grade) {
        if(grade <= 100 && grade >= 70) {
            return 'A';
        }
        else if(grade >= 60 && grade < 70) {
            return 'B';
        }
        else if(grade >= 40 && grade < 60) {
            return 'C';
        }
        else if(grade < 40 && grade >= 0) {
            return 'F';
        }
        else {
            return 'I';
        }
    }
}
