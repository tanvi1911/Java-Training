package com.globalpayex.college;

public class Student extends CollegeUser {
    //object attributes
    //instance variables
    int roll;
    int marks;

    //Class Attributes
    static int count;

    public Student(){
        this("NA", 'm', -1, 0);
    }

    public Student(String name, char gender, int roll, int marks) {
        //this -> current object
        super(name, gender); // will always come in first line
        Student.count++;
        this.roll = roll;
        this.marks = marks;
    }

    public static Student createInstance(String name, char gender, int roll, int marks) {
        var s = new Student(name, gender, roll, marks);
        return s;
    }

    @Override
    public String getDetails() {
                String part1 = super.getDetails();
        return String.format(
                "%s\nRoll no.: %s\nMarks: %s",
                part1,
                this.roll,
                this.marks
        );
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

    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F'){
            this.gender = gender;
        }
    }

    public char getGender() {
        return this.gender;
    }
}
