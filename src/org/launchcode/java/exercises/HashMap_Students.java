package org.launchcode.java.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Students {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Input the students you need to add to the ID-list. Press ENTER to finish..");

        do{
            System.out.print("Student:");
            newStudent = in.nextLine();

            if(!newStudent.equals("")){
                System.out.print("Student-ID:");
                Integer newID = in.nextInt();
                students.put(newID, newStudent);
                in.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");
        for(Map.Entry<Integer, String> student: students.entrySet()){
            System.out.println("Name: " + student.getValue() + "\nID: " + student.getKey() );
        }
    }
}
