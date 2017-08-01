package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius, area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What's the radius of the circle you're trying to calculate?");
        radius = in.nextDouble();

        while (radius < 0){
            System.out.println("The radius value is incorrect! Give me a new value!");
            radius = in.nextDouble();
        }
        area = radius * radius * 3.14;
            System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
    }
}
