package com.company;

public class Student implements Comparable<Student> {
    private String name;
    private int gpa;
    public Student(){

    }
    public Student(String name,int gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public int getGpa(){
        return gpa;
    }
    public String getName(){

        return name;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.gpa,o.getGpa());
    }
}
