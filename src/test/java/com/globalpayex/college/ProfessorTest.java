package com.globalpayex.college;

import com.abc.salary.SalariedIndividual;
import com.abc.salary.SalaryCalculator;
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
        var p1 = new Professor("Simran", 'F', subjects, 15, 5000);
        var p2 = new Professor("Jay", 'M', subjects, 22, 6000);
        assertEquals(2,Professor.count);
    }

    @Test
    void testProfessorDetails(){
        String[] subjects = {"Python", "C++"};
        var p1 = new Professor("Simran", 'F', subjects, 17, 5000);

        String expected = "Name: Simran\nGender: F";
        String actual = p1.getDetails();
        assertEquals(expected, actual);

    }

    @Test
    void testSalaryCalculator(){
        String[] subjects = {"Python", "C++"};
        var p1 = new Professor("Simran", 'F', subjects, 15, 5000);
        var expected = 67320;
        var actual = p1.calculate();
        assertEquals(expected, actual);
    }

}