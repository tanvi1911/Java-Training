package com.globalpayex.college;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentMarksAvgTest {

    @Test
    void testAvg() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tanvi", 'F', 19, 91));
        students.add(new Student("Yash", 'M', 10, 95));
        students.add(new Student("Anisha", 'F', 62, 98));
        students.add(new Student("Chirag", 'M', 20, 82));

        var expected = 20.5;
        var actual = StudentMarksAvg.calculate(students);
        assertEquals(expected, actual);

    }
}