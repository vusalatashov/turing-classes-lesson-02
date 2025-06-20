package az.edu.turing.module01.lesson04;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        int[] numbers2 = numbers;
//        numbers= new int[]{1, 4, 5, 32323, 5674362};
////        for (int i = 0; i < numbers.length; i++) {
////            System.out.println(numbers[i]);
////        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
//        for (int num : arr) {
//            num = 5;
//        }
        System.out.println(Arrays.toString(arr));


//        System.out.println(Arrays.toString(numbers2));
//        System.out.println(Arrays.toString(numbers));


    }
}
