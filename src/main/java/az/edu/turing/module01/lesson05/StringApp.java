package az.edu.turing.module01.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class StringApp {
    public static void mainV2(String[] args) {
//        String word = new String("HellO World");
//        String word2 = "Hello World";
//        System.out.println(word.equalsIgnoreCase(word2));
//        String surname =" Ibrahimov";
//        System.out.println(name +" "+ surname);
//        String name2 = new String("Tural");
//        name="H u S e Y n";
////        System.out.println(" ");


//        word=word.replace('o','3');
//        word=word.toUpperCase();
//        char a=word.charAt(7);

//        System.out.println(a);
//        System.out.println(word);
//        System.out.println(word.trim());
//        System.out.println(word.concat(word));
//        System.out.println(Arrays.toString(word.split("u")));
//
//        int a= 5;
//        String b="Azerbaijan"+a;
//        String c=String.valueOf(5);
//        System.out.println(b+a);

    }

    public static void main(String[] args) {

        StringBuilder word=new StringBuilder("shvjhwd");

        StringBuffer word3=new StringBuffer("shvjhwd");
        Scanner scanner=new Scanner(System.in);
        word.delete(4,8);
        System.out.println( word.indexOf("j"));
        String word2= new String(word);
        word2.concat(" new");
//        System.out.println(word2);
        word.delete(4,8);
//        System.out.println("string builder "+word);



    }
}
//word2   "Hello World"
// |-> "Hello World new"