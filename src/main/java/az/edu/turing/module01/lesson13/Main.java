package az.edu.turing.module01.lesson13;

import az.edu.turing.module01.family.Human;

public class Main {

    public static void mainv2(String[] args) {
        Object labrador = new Dog("Labrador", 3, "Male");
        Animal persian = new Cat("Persian", 2, "White");
        Animal animal = new Animal("Animal", 1);


        //cat
//        persian.meow();
//        persian.purr();
//        persian.sleep();
//        persian.eat();

        //dog
//        labrador.eat();
//        labrador.sleep();
//        labrador.bark();
//        System.out.println(labrador.toString());

    }

    public static class instanceofExample {
        public static void main(String[] args) {
//            Animal animal = new Animal("Animal", 1);
//            Animal dogPoli = new Dog("Labrador", 3, "Male");

//            Cat cat = new Cat("Persian", 2, "White");

            Object dog1 = new Animal("jhdbvfjusdh", 3 );
            Object dog2 = new Animal("Labrador", 3 );
            System.out.println(dog1.equals(dog2));

//            System.out.println(dog instanceof Animal);
//            System.out.println(dog instanceof Cat);
//            System.out.println(animal instanceof Animal);
//            System.out.println(dog instanceof Animal);
//            System.out.println(cat instanceof Animal);
//            System.out.println(dog instanceof Dog);
//
//            System.out.println("----------------------");
//            System.out.println(dogPoli instanceof Cat);

//            Cat dog2 = (Cat) dogPoli;
//            dog2.meow();
        }
    }
}