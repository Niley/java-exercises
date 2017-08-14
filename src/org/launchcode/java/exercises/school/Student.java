package org.launchcode.java.exercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    //<editor-fold desc="constructors">
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId++);
    }
    //</editor-fold>

    //<editor-fold desc="Getters and setters">
    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    private void setGpa(double aGpa){
        gpa = aGpa;
    }
    //</editor-fold>



}