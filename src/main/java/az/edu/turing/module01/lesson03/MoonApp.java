package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class MoonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter month number: ");


//        System.out.println((month > 0 && month < 13) ?
//                (month >= 3 && month <= 5) ? "Spring" :
//                        (month >= 6 && month <= 8) ? "Summer" :
//                                (month >= 9 && month <= 11) ? "Autumn" : "Winter" : "Invalid month");

//        if(month > 0 || month < 13) {
//            if(month >= 3 && month <= 5){
//                System.out.println("Spring");
//            }
//            else if(month >= 6 && month <= 8){
//                System.out.println("Summer");
//            }
//            else if(month >= 9 && month <= 11){
//                System.out.println("Autumn");
//            }
//            else{
//                System.out.println("Winter");
//            }
//        }
//        else{
//            System.out.println("Invalid month");
//        }
//

//        int month = scanner.nextInt();
//        switch (month) {
//            case 1 : System.out.println("January");break;
//            case 1 : System.out.println("February");
//            case 3 : System.out.println("March");
//            case 4 : System.out.println("April");
//            case 5 : System.out.println("May");break;
//            case 6 : System.out.println("June");break;
//            case 7 : System.out.println("July");break;
//            case 8 : System.out.println("August");break;
//            case 9 : System.out.println("September");break;
//            case 10 : System.out.println("October");break;
//            case 11 : System.out.println("November");break;
//            case 12 : System.out.println("December");break;
//            case 13 : System.out.println("gyugfuydsgfuds");break;

//    }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2;j++ ) {
                System.out.println(++count+"--------"+j);
            }
        }
    }
}
