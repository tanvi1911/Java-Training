package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void testIsEven(){
        var n = 9;
        var expected = false;

        var actual = EvenOrOdd.testIsEven(n);

        assertEquals(expected, actual);
    }

    @Test
    void testIsOdd(){
        var n = 9;
        var expected = "Odd";

        var actual = EvenOrOdd.isEven(n);

        assertEquals(expected, actual);
    }
}

