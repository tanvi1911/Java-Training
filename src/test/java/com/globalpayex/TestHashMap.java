package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


public class TestHashMap {

    @Test
    void testHashMap(){

        HashMap<Integer, String> map = new HashMap<>();
        assertEquals(0, map.size());

        //add an entry
        map.put(7, "Tanvi");
        map.put(10, "Sarvesh");
        assertEquals(2, map.size());

        //get entry
        assertEquals("Tanvi", map.get(7));
        assertEquals("Sarvesh", map.get(10));

        //update entry
        map.put(7, "Riya");
        assertEquals("Riya", map.get(7));

        //delete an entry from the map
        map.remove(10);
        assertEquals(1, map.size());

        //get a list of all the values in the map
        var values = map.values();
        System.out.println(values);

        var keys = map.keySet();
        System.out.println(keys);

    }
}
