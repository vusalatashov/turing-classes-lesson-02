package az.edu.turing.module01.lesson26;

import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) {
        String path = "/Users/macbook/Documents/turing/turing-classes-lesson-02/src/main/java/az/edu/turing/module01/lesson26/resource/bufertest.txt";
//        try (FileWriter fileWriter = new FileWriter(path,true);
//             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
//            ) {
//            bufferedWriter.write("salam");
//            System.out.println("Yazıldı!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (FileReader fileReader =new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ){
            System.out.println(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
