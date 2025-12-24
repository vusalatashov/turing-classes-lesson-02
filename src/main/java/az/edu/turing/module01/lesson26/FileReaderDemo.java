package az.edu.turing.module01.lesson26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileReaderDemo {
    public static void main(String[] args) {
        String path = "/Users/macbook/Documents/turing/turing-classes-lesson-02/src/main/java/az/edu/turing/module01/lesson26/resource/test.txt";
        try (FileWriter fileWriter = new FileWriter(path,true)) {
            fileWriter.write("salam");
            System.out.println("Yazıldı!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}