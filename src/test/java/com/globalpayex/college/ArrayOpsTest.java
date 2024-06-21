package com.globalpayex.college;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOpsTest {

    @Test
    void testAverage(){
        int[] arr1 = {1,2,3,4,5};
        //Avg = 3

        int expected = 3;
        float actual = ArrayOps.average(arr1);
        assertEquals(expected, actual);
    }

    @Test
    void testMax(){
        int[] arr1 = {1,2,3,4,5};
        //Avg = 3

        int expected = 5;
        int actual = ArrayOps.max(arr1);
        assertEquals(expected, actual);

    }

    @Test
    void testNextGen(){
        var actual = ArrayOps.nextGenSum(5,2,4,8);
        assertEquals(19, actual);

        actual = ArrayOps.nextGenSum(5,2);
        assertEquals(7, actual);

        actual = ArrayOps.nextGenSum();
        assertEquals(0, actual);

    }

}