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

//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
        //{1,3,5,7,9}

//        for (int num : arr) {
//            num = 5;
//        }
//        System.out.println(Arrays.toString(arr));


//        System.out.println(Arrays.toString(numbers2));
//        System.out.println(Arrays.toString(numbers));
//        int[][] matrix = new int[1000][1000];
        //{{1,2,3},{4,5,6,5},{7,8,9}}
//        System.out.println(matrix);

//
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.println("size of row " + i + " is " + matrix[i].length);
//                System.out.println("element" + matrix[i][j]);
//                matrix[i][j] = i * j;
//            }
//        }
        int i = 0;
        int j = 0;
        int[][] matrix = {{0, 2, 0}, {4, 5, 6, 5}, {7, 8, 9}};
        while (i < matrix.length) {
            while (j < matrix[i].length) {
                if (j==1){
                    continue;
                }
                System.out.println("size of row  " + i + " is " + matrix[i].length);
                System.out.println("element" + matrix[i][j]);
                matrix[i][j] = i * j;
                j++;

            }
            i++;
        }

        System.out.println(Arrays.deepToString(matrix));
    }



}


//correct password :12345678
// username : vusal
// password : 123344567