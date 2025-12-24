package az.edu.turing.module01.lesson21;

import java.util.ArrayList;
import java.util.List;

class Animal<T extends Number> {
    public T id;
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
//
//class Dog  {
//    void sound()
//}

public class GenericMethodsExample {

    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }

    public static <T extends Animal> void playSound(T animal) {
        System.out.println("Making sound:");
        animal.sound();
    }

    public <T> void printListSuper(List<? super T> list, T item) {
        list.add(item);
        System.out.println("List elements: " + list);
    }

    public <T extends Animal> void showAnimal(T animal) {
        System.out.println("This animal:");
        animal.sound();
    }

    public static void main(String[] args) {

        System.out.println(new Animal("sagd"));
        GenericMethodsExample.printItem("Hello Generics!");
        GenericMethodsExample.printItem(123);

//        Dog dog = new Dog();
//        GenericMethodsExample.playSound(dog);

        GenericMethodsExample example = new GenericMethodsExample();
        List<Object> myList = new ArrayList<>();
        example.printListSuper(myList, "New Element");

//        example.showAnimal(dog);
    }
}
