package com.globalpayex;

import com.globalpayex.college.Student;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchStudent {

    public static void main(String[] args) {

/*
    List<Student> students = Arrays.asList(
            new Student("Tanvi", 'F', 19, 91),
            new Student("Yash", 'M', 10, 95),
            new Student("Anisha", 'F', 62, 98),
            new Student("Chirag", 'M', 20, 82)
    );
 */

        HashMap<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(19,new Student("Tanvi",'F', 19,91));
        studentMap.put(10,new Student("Yash",'M', 10,95));
        studentMap.put(62,new Student("Anisha",'F', 62,99));
        studentMap.put(20,new Student("Chirag",'M', 20,82));



        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter the roll no.: ");
        int n = scanner.nextInt();
    /*
    var StudentOp = students.stream()
                    .filter(s -> s.getRoll() == n)
                    .collect(Collectors.toList());

    if(StudentOp.isEmpty()){
        System.out.println("Not Found");
    }
    else{
        System.out.println(StudentOp);
    }
    */
    /*
    boolean is_Found = false;
    for(Student student : students){
        if(student.getRoll() == n){
            is_Found = true;
            System.out.println(student);
            break;
        }
    }
    if(!is_Found){
        System.out.println("Not Found");
    }*/

//        if(students.contains(new Student("",'M', n, 0 ))){
//            System.out.println("Found");
//        }
//        else {
//            System.out.println("Not Found");
//        }
//        var roll_no = student.keySet();
//        System.out.println(roll_no);
//        if (student.containsKey(n)) {
//            System.out.println("Found");
//        }
//        else {
//            System.out.println("Not FOund");
//        }

        Student student = studentMap.get(n);
        if(student != null){
            System.out.println(student);
        }
        else{
            System.out.println("Not Found");
        }
    }

}
