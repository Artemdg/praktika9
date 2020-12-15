package com.company;

import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;
    LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }
    public void createLabClass(){
        System.out.println("Введите имя студента и его оценку;Exit-для выхода");
        String name;
        int gpa;
        String exit="exit";
        Scanner scanner=new Scanner(System.in);
        do{
            name = (scanner.next());
            if(!name.equals(exit)){
                gpa=scanner.nextInt();
                labClass.addStudent(new Student(name,gpa));
            }
        }while(!name.equals(exit));
    }
}
