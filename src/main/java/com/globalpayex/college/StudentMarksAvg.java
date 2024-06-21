package com.globalpayex.college;

import java.util.ArrayList;

public class StudentMarksAvg {

    public static double calculate(ArrayList<Student> students) {
        int sum = 0;
        for(Student student: students){
            sum = student.marks;
        }
        return (double) sum /students.size();
    }
}
