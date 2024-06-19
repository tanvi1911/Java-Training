package com.globalpayex;

public class Rectangle {
    public static double perimeter(double length,double breadth){
        var rect_perimeter = 2*(length+breadth);
        return rect_perimeter;
    }
    public static double area(double length, double breadth){
        var rect_area = length * breadth;
        return rect_area;
    }
}
