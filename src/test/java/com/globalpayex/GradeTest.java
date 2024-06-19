package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

//    @Test
//    @CS
//    void GradeA(){
//        var grade = 80;
//        var expected = "A";
//
//        var actual = Grade.checkGrade(grade);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void GradeB(){
//        var grade = 60;
//        var expected = "B";
//
//        var actual = Grade.checkGrade(grade);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void GradeC(){
//        var grade = 46;
//        var expected = "C";
//
//        var actual = Grade.checkGrade(grade);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void GradeF(){
//        var grade = 20;
//        var expected = "F";
//
//        var actual = Grade.checkGrade(grade);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void GradeI(){
//        var grade = -22;
//        var expected = "Invalid Input";
//
//        var actual = Grade.checkGrade(grade);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void BoundaryTestCase(){
//        var grade = 0;
//        var expected = "F";
//
//        var actual = Grade.checkGrade(grade);
//        assertEquals(expected, actual);
//    }

    @ParameterizedTest
    @CsvSource({
            "71,A",
            "70,A",
            "64,B",
            "60,B",
            "58,C",
            "50,C",
            "29,F",
            "39,F",
            "200,I",
            "-71,I",
    })

    void TestGrade(int mark, char expected){
        var actual = Grade.checkGrade(mark);
        assertEquals(expected, actual);
    }

}
