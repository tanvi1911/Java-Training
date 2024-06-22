package com.globalpayex;

import com.globalpayex.college.Student;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TestArrayListTest {

    @Test
    void testArrayList(){
        ArrayList<String> cars = new ArrayList<>();
        assertEquals(0, cars.size());

        //add
        cars.add("i10");
        cars.add("i20");
        assertEquals("i10", cars.get(0));
        assertEquals("i20", cars.get(1));

        cars.add(1, "Mercedes");
        assertEquals("i20", cars.get(2));
        assertEquals("Mercedes", cars.get(1));

        cars.set(0, "Audi");
        assertEquals("Audi", cars.get(0));

        cars.remove(0);
        assertEquals("Mercedes", cars.get(0));

        cars.remove("Mercedes");
        assertEquals("i20", cars.get(0));


        assertFalse(cars.isEmpty());
        assertTrue(cars.contains("i20"));
        assertFalse(cars.contains("Audi"));
    }

    @Test
    void testSorting() {
        var nos = Arrays.asList(11,5,2,88,4);
        Collections.sort(nos);
        assertEquals(2, nos.get(0));
        assertEquals(88, nos.get(nos.size()-1));

        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testSortingDescending() {

//        class MyComparator implements Comparator<Integer> {
//
//            @Override
//            public int compare(Integer o1,Integer o2) {
//                return o2.compareTo(o1);
//            }
//        }

        //anonymous inner class
        var nos = Arrays.asList(11,5,2,88,4);
//        Collections.sort(nos, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
        //Lambda Expression (since Java v8)
        //FUnctional Programming
        // Collections.sort(nos, (o1 ,o2) -> o2.compareTo(o1));

        assertEquals(88, nos.get(0));
        assertEquals(2, nos.get(nos.size()-1));

        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testEvenNum(){
        var nos = Arrays.asList(11,16,5,2,88,4);

        /*List newList = new ArrayList<>();
        nos.forEach(num -> {
            if(num %2 == 0 && num >= 2){

                newList.add(num);

            }
        });*/


        var newList = nos.stream().filter(element -> element % 2 == 0 && element >= 2)
                .collect(Collectors.toList());
        var expected = Arrays.asList(16,2,88,4);
        assertEquals(expected, newList);
    }


    @Test
    void testDeductingBy1(){
        var nos = Arrays.asList(11,16,5,2,88,4);
        var expected = Arrays.asList(10,15,4,1,87,3);

        var actual = nos.stream().map(element -> element - 1).collect(Collectors.toList());
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void filterPlusMap(){
        var nos = Arrays.asList(11,16,5,2,88,4);
        //to build up a new list
            //filter out all the elements more than 1 from the nos list
            //square each of the odd elements
            //collect it in a list
        var expected = Arrays.asList(121, 25);
        var actual = nos.stream().filter(elements -> elements > 1 && elements %2 == 1).map(elements -> elements * elements).collect(Collectors.toList());
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testStudents1(){
        var  students = Arrays.asList(
                new Student("Tanvi", 'F', 19, 91),
                new Student("Yash", 'M', 10, 95),
                new Student("Anisha", 'F', 62, 98),
                new Student("Chirag", 'M', 20, 82)
        );
        var expected = "Tanvi, Anisha";
        var actual = students.stream().filter(names -> names.getGender() == 'F')
                .map(name -> name.getName()).collect(Collectors.joining(", "));
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testStudents2(){
        //create a new list of female Student objects sorted in the ascending order of marks
        var  students = Arrays.asList(
                new Student("Tanvi", 'F', 19, 91),
                new Student("Yash", 'M', 10, 95),
                new Student("Anisha", 'F', 62, 98),
                new Student("Chirag", 'M', 20, 82)
        );

        var expected = Arrays.asList(
                new Student("Tanvi", 'F', 19, 91),
                new Student("Anisha", 'F', 62, 98)
        );

        var actual = students.stream().
                filter(student -> student.getGender() == 'F').
                sorted((s1, s2) -> Integer.valueOf(s2.getGrade()).compareTo(Integer.valueOf(s1.getGrade())))
                        .collect(Collectors.toList());
        System.out.println(expected);
        System.out.println(actual);
        assertEquals(expected.get(0).getGrade(), actual.get(0).getGrade());
        assertEquals(expected.get(1).getGrade(), actual.get(1).getGrade());

    }
}