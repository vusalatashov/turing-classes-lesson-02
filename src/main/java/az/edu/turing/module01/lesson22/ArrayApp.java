package az.edu.turing.module01.lesson22;

import java.util.*;

public class ArrayApp {

    public static void main(String[] args) {

//        String[][][] lettersArr3D = new String[4][4][4];
//
//        char letterC = 65;
//        char letterL = 97;
//        for (int i = 0; i < lettersArr3D.length; i++) {
//            for (int j = 0; j < lettersArr3D[i].length; j++) {
//                for (int k = 0; k < lettersArr3D[i][j].length; k++) {
//
//                    String letter = String.valueOf(letterC) + String.valueOf(letterL);
//                    lettersArr3D[i][j][k] = letter;
//                    letterC++;
//                    letterL++;
//                }
//            }
//        }


        Integer maxNumber = null;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};//space
        int[][] arr2 = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20}};//space
        int[][][] arr3 = {{{1, 2, 3},{4, 5, 6},{7, 8, 9},{10, 11, 12},{13, 14, 15},{16, 17, 18},{19, 20, 21}}};//space

        for (int i = 0; i < arr1.length; i++) {
            if (maxNumber == null || arr1[i] > maxNumber) {
                maxNumber = arr1[i];
            }
        }
        System.out.println(maxNumber);

        //Emin
        //time On
        //space O1
        Integer[] arr= new Integer[10];
        //{1,2,3,4,5,6,7,8
        //Integer[] arr= new Integer[15];
        //{1,2,3,4,5,6,7,8



        List<Integer> list1 = new ArrayList<>(); //default capacity 10
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();

    }
}