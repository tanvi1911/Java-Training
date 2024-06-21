package com.globalpayex;

import com.globalpayex.college.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void testArray(){
        Integer[] arr1 = {1,2,3,4,5};
        var nos = new MyArray<Integer>(arr1);
        assertEquals(1, nos.get(1));

        nos.set(2,20);
        assertEquals(20, nos.get(2));


    }

    @Test
    void testArrayOfStudents(){
        Student[] students = {
                new Student("Tanvi", 'F', 19, 91),
                new Student("Yash", 'M', 10, 95),
                new Student("Anisha", 'F', 62, 98),
                new Student("Chirag", 'M', 20, 82)
        };

        MyArray<Student> ma = new MyArray<>(students);
        assertEquals("Tanvi", ma.get(1).getName());

        ma.set(2,new Student("Priya",'F', 13, 76));
        assertEquals("Priya", ma.get(2).getName());

    }



}