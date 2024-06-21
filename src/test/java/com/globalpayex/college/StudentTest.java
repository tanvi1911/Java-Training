package com.globalpayex.college;

import com.globalpayex.Grade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    @BeforeEach
    void init() {
        Student.count = 0;
    }

    @Test
    void testObjectCreation(){
        assertEquals(0,Student.count);
        var s1 = new Student();
        var s2 = new Student();

        assertTrue(s1 != s2);
        assertNotNull(s1.name);
        assertNotNull(s2.name);
        assertEquals(-1,s1.roll);
        assertEquals(-1,s2.roll);
        assertEquals(0,s1.marks);
        assertEquals(0,s2.marks);

        s1.roll = 10;
        s2.roll = 12;
        assertEquals(10,s1.roll);
        assertEquals(12,s2.roll);
        assertEquals(2, Student.count);
    }

    @Test
    void testGetDetails(){
        var s1 = new Student("Tanvi", 'F', 19, 91);
//        s1.name = "Tanvi";
//        s1.gender = 'F';
//        s1.roll = 19;
//        s1.marks = 91;
        System.out.println(s1);

        String expected = "Name: Tanvi\nGender: F\nRoll no.: 19\nMarks: 91";
        String actual = s1.getDetails();
        assertEquals(expected, actual);
    }
    @Test
    void TestGrade() {
        var s2 = new Student();
        s2.name = "Jake";
        s2.setGender('M');
        s2.roll = 21;
        s2.marks = 60;
        char expected1 = 'B';
        var actual1 = s2.getGrade();
        assertEquals(expected1, actual1);
    }

    @Test
    void testNewWayOfTestCreation() {
        var s1 = Student.createInstance("Tanvi", 'F', 19, 91);

        String expected = "Name: Tanvi\nGender: F\nRoll no.: 19\nMarks: 91";
        String actual = s1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testValidGender(){
        var s = new Student();
        // s.gender = 'x'; //it is private

        s.setGender('X');
        assertNotEquals('X', s.getGender());

        s.setGender('M');
        assertEquals('M', s.getGender());

        s.setGender('F');
        assertEquals('F', s.getGender());

        var s2 = new Student("Tanvi", 'x', 19, 91);
        assertNotEquals('x', s2.getGender());

    }
}