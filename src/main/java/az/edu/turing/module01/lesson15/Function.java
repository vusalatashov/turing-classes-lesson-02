package az.edu.turing.module01.lesson15;

@FunctionalInterface
public interface Function {
    String functionName="swim";

    void swim();
//    void fly();


    default void print() {
        System.out.println("jhdfvhgvsdfhds");
    }
}
