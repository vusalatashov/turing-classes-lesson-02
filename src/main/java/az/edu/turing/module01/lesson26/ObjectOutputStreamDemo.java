package az.edu.turing.module01.lesson26;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Saleh", 20);
        Student student2 = new Student("Ayle", 21);

        String path = "/Users/macbook/Documents/turing/turing-classes-lesson-02/src/main/java/az/edu/turing/module01/lesson26/resource/student.txt";

        File file = new File(path);
        boolean exists = file.exists() ;
        boolean  empty = file.exists() && file.length() != 0;


        System.out.println("File exists: " + exists);
        System.out.println("File is empty: " + empty);
        try (FileOutputStream fileOut = new FileOutputStream(path, true);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student1);
            out.writeObject(student2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    Student readStudent = (Student) in.readObject();
                    System.out.println("Read student: " + readStudent);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
