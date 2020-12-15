package com.company1;

import java.util.Scanner;

public class LabClassUI {
    LabClass labClass;
    public LabClassUI(){
         labClass=new LabClass();
         LabClassDriver driver = new LabClassDriver(labClass);
        System.out.println("Хотите ли вы создать список?(да(1) или нет(0))");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        if(input==1){
            driver.createLabClass();
        }else{
            System.exit(0);
        }
    }
    public void findStudent(){
        System.out.println("Введите имя студента и его оценку ");
        Scanner scanner=new Scanner(System.in);
        try{
            String name=scanner.next();
            int gpa=scanner.nextInt();
            if(labClass.find(name)!=null){
                if(labClass.find_gpe(name,gpa)!=null) System.out.println("Данные верны!");;
            }
        } catch (StudentNotFoundException | EmptyStringException e) {
            e.printStackTrace();
        }
    }
 public static void main(String[] args){
    LabClassUI start=new LabClassUI();
    start.findStudent();
  }
}
