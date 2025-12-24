package az.edu.turing.module01.lesson21;

import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        // system.out :: println
        Consumer<Integer> print = System.out::println;

        // 1. Predicate: Anonymous Class
        Predicate<Integer> isEvenAnon = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        System.out.println("1) Anonymous Predicate: " + isEvenAnon.test(4));

        // 2. Predicate: Lambda
        Predicate<Integer> isEvenLambda = n -> n % 2 == 0;
        Predicate<Integer> isEvenLambda3 = n -> n % 3 == 0;
        System.out.println("2) Lambda Predicate: " + isEvenLambda.test(5));

        // 3. Predicate: Method Reference (Static Method)
        Predicate<Integer> isEvenMethodRef = FunctionalInterfacesDemo::checkEven;
        Predicate<Integer> isEvenMethodRef2 = FunctionalInterfacesDemo::checkEven;

        System.out.println("3) Method Ref Predicate: " + isEvenMethodRef.test(6));
        System.out.println("3) Method Ref Predicate: " + isEvenMethodRef.test(7));
        System.out.println("3) Method Ref Predicate: " + isEvenMethodRef.test(9));


        // 4. Function: Anonymous Class
        Function<String, Integer> lengthAnon = new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {
                return str.length();
            }
        };
        System.out.println("4) Anonymous Function: " + lengthAnon.apply("Hello"));

        // 5. Function: Lambda
        Function<String, Integer> lengthLambda = str -> str.length();
        System.out.println("5) Lambda Function: " + lengthLambda.apply("World"));

        // 6. Function: Method Reference (Instance Method)
        Function<String, Integer> lengthMethodRef = String::length;
        System.out.println("6) Method Ref Function: " + lengthMethodRef.apply("Java"));


        // 7. Consumer: Anonymous Class
        Consumer<String> printAnon = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("7) Anonymous Consumer: " + s);
            }
        };
        printAnon.accept("Hello from Anonymous Class!");

        // 8. Consumer: Lambda
        Consumer<String> printLambda = s -> System.out.println("8) Lambda Consumer: " + s);
        printLambda.accept("Hello from Lambda!");

        // 9. Consumer: Method Reference (System.out::println)
        Consumer<String> printMethodRef = System.out::println;
        printMethodRef.accept("9) Method Ref Consumer: Hello from Method Reference!");


        // 10. Supplier: Anonymous Class
        Supplier<Double> randomAnon = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println("10) Anonymous Supplier: " + randomAnon.get());

        // 11. Supplier: Lambda
        Supplier<Double> randomLambda = () -> Math.random();
        System.out.println("11) Lambda Supplier: " + randomLambda.get());

        // 12. Supplier: Method Reference (Static Method)
        Supplier<Double> randomMethodRef = Math::random;
        System.out.println("12) Method Ref Supplier: " + randomMethodRef.get());
    }

    // Method reference için statik metod
    public static boolean checkEven(int n) {
        return n % 2 == 0;
    }
}
