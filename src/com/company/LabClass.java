package com.company;

import java.util.ArrayList;

public class LabClass {
    public ArrayList<Student> arr;
    Student errStudent=null;
    Student errStudent2=null;
    public LabClass(){
        this.arr=new ArrayList<>();
    }

    public void addStudent(Student student){
        arr.add(student);
        arr.sort(Student::compareTo);
    }

    public Student find(String name) throws StudentNotFoundException{
        for(Student a:arr){
            if(a.getName().equals(name)){
                errStudent=a;
            }
        }
        if(errStudent==null) throw new StudentNotFoundException("Студент "+name+" не найден!");
         return errStudent;
    }
    public Student find_gpe(String name,int gpa) throws EmptyStringException {
        for(Student a:arr){
            if(a.getName().equals(name)&&a.getGpa()==gpa) {
                errStudent2 = a;
            }
        }
        if(errStudent2==null) throw new EmptyStringException("Студент "+name+" не имеет данную оценку: "+gpa);
        return errStudent2;
    }
}
