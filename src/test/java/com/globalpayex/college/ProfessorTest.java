package com.globalpayex.college;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init() {
        Student.count = 0;
    }

    @Test
    void testObjectCreation(){
        assertEquals(0,Professor.count);
        String[] subjects = {"Python", "C++"};
        var p1 = new Professor("Simran", 'F', subjects);
        var p2 = new Professor("Jay", 'M', subjects);
        assertEquals(2,Professor.count);
    }

    @Test
    void testProfessorDetails(){
        String[] subjects = {"Python", "C++"};
        var p1 = new Professor("Simran", 'F', subjects);

        String expected = "Name: Simran\nGender: F";
        String actual = p1.getDetails();
        assertEquals(expected, actual);

    }

}