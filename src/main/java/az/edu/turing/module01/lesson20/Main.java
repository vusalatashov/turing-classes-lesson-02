package az.edu.turing.module01.lesson20;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ali", 20, 85.5, "IT"),
                new Student("Nigar", 20, 91.2, "Math"),
                new Student("Rauf", 23, 77.0, "Physics"),
                new Student("Kamal", 20, 91.2, "IT"),
                new Student("Aysel", 22, 88.0, "Biology")
        };

        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
        printArray(students);
    }

    public static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
//        System.out.println("Original array:");
//        printArray(students);
//
//        sortByAgeAscending(students);
//        System.out.println("\nSorted by age (ascending):");
//        printArray(students);
//
//        sortByGpaDescending(students);
//        System.out.println("\nSorted by GPA (descending):");
//        printArray(students);
//
//        sortByNameAscending(students);
//        System.out.println("\nSorted by name (alphabetical):");
//        printArray(students);
//
//        multiLevelSort(students);
//        System.out.println("\nMulti-level sort:");
//        printArray(students);

//    public static void sortByAgeAscending(Student[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j].getAge() > arr[j + 1].getAge()) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void sortByGpaDescending(Student[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j].getGpa() < arr[j + 1].getGpa()) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void sortByNameAscending(Student[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void multiLevelSort(Student[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (compareStudents(arr[j], arr[j + 1]) > 0) {
//                    Student temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    private static int compareStudents(Student s1, Student s2) {
//        if (s1.getAge() != s2.getAge()) {
//            return Integer.compare(s1.getAge(), s2.getAge());
//        }
//        if (Double.compare(s1.getGpa(), s2.getGpa()) != 0) {
//            return -Double.compare(s1.getGpa(), s2.getGpa());
//        }
//        if (!s1.getName().equals(s2.getName())) {
//            return s1.getName().compareTo(s2.getName());
//        }
//        return s1.getDepartment().compareTo(s2.getDepartment());
//    }
//
//    public static void printArray(Student[] arr) {
//        for (Student s : arr) {
//            System.out.println(s);
//        }
//    }