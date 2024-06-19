package com.globalpayex.college;

public class Student {
    //object attributes
    //instance variables
    String name;
    char gender;
    int roll;
    int marks;

    public String getDetails() {
//        implicit parameter - this - s1,s2 -s10 --> current object
        return "Name: " + this.name + "\nGender: " + this.gender + "\nRoll no.: " + this.roll + "\nMarks: " + this.marks;
    }

    public char getGrade() {
        if(this.marks <= 100 && this.marks >= 70) {
            return 'A';
        }
        else if(this.marks >= 60 && this.marks < 70) {
            return 'B';
        }
        else if(this.marks >= 40 && this.marks < 60) {
            return 'C';
        }
        else if(this.marks < 40 && this.marks >= 0) {
            return 'F';
        }
        else {
            return 'I';
        }
    }
}
