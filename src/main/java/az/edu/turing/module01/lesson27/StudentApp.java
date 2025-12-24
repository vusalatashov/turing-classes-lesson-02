package az.edu.turing.module01.lesson27;

import java.io.*;

public class StudentApp {
    public static void main(String[] args) {
        Student student3 = new Student("Sevinc", 20);
        Student student1 = new Student("Gozel", 16);
        Student student2 = new Student("Saleh", 22);


        String path = "/Users/macbook/Documents/turing/turing-classes-lesson-02/src/main/java/az/edu/turing/module01/lesson27/resource/student.txt";

        try (FileWriter fileWriter = new FileWriter(path, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write(student1.toString());
            bufferedWriter.write(student2.toString());
            bufferedWriter.write(student3.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
