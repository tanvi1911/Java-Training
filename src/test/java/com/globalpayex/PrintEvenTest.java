package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintEvenTest {

    @Test
    void printEven(){
        var n = 11;
        var expected = "0,2,4,6,8,10";

        var m = 8;
        var expected2 = "0,2,4,6,8";

        var actual = PrintEven.printEven(n);
        var actual2 = PrintEven.printEven(m);
        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }


}