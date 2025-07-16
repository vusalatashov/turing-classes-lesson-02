package az.edu.turing.module01.lesson11;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("emil",15);
        //Student class-count =1
        Student student2 = new Student("tural",100);
        //Student class-count =2
        Student.setCount(10000);
        System.out.println("student1 count : "+student1.getCount());
        System.out.println("student1 name : "+student1.getName());


        System.out.println("student2 count : "+student2.getCount());
        System.out.println("student2 name : "+student2.getName());

        System.out.println("object count : " +(Student.getObjectCount()));
        String name=StudentApp.getNameStudent(student1);

    }
    public static String getNameStudent(Student student) {
        System.out.println(student.getName());
        return student.getName();
    }
}