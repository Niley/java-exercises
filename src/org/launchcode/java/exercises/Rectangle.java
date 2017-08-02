package org.launchcode.java.exercises;
import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args){
        int height, base, area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the height measurement of the rectangle?(only use whole numbers)");
        height = in.nextInt();
        System.out.println("What is the base measurement of the rectangle?(only use whole numbers)");
        base = in.nextInt();

        area = height * base;
        System.out.println("The area of a rectangle with a base of " + base + " and a height of " + height + " is:" + area);

    }



}
