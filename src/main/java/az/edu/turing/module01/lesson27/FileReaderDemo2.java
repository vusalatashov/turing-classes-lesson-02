package az.edu.turing.module01.lesson27;


import java.io.*;
import java.util.ArrayList;


public class FileReaderDemo2 {

    public static void main(String[] args) throws IOException {
        String path = "/Users/macbook/Documents/turing/turing-classes-lesson-02/src/main/java/az/edu/turing/module01/lesson27/resource/demo.txt";

        try (FileWriter fileWriter = new FileWriter(path, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            fileWriter.write("Hello World");

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

    }
}
