package az.edu.turing.module01.lesson17;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class LocalDateApp {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
////        System.out.println(date);
//
//        LocalTime time = LocalTime.now();
////        System.out.println(time);
////        for (int i = 0; i < 100000000; i++) {
////
////            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
////            System.out.println(timestamp);
////        }
//        LocalDateTime dateTime = LocalDateTime.
//        System.out.println(dateTime);
//
//        // ad gununuzu hesablayin gun olaraq
//        // local date and timenin min ve max deyerlerini tapin
//        // YYYY/MM/DD HH/MM/SS  2025-08-01T20:09:17.340827 bu yazilisin formatini deyisin turkiye vaxtini cap edin
        int birthYear, birthMonth, birthDay;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();

        System.out.print("Enter your birth month: ");
        birthMonth = sc.nextInt();

        System.out.print("Enter your birth day: ");
        birthDay = sc.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.MAX;

        if (birthDate.isAfter(today)) {
            System.out.println("Birth date is in the future.");
            return;
        }


        long daysLived = ChronoUnit.DAYS.between(birthDate, today);

        System.out.println(daysLived);
    }
}
