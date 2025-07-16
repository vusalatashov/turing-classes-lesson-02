package az.edu.turing.module01.lesson12;

import java.util.Scanner;

public class StarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printTriangle(size);
    }

    public static void printTriangle(int size) {
        int spaceSize = size - 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < spaceSize; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaceSize--;
        }
    }
}
