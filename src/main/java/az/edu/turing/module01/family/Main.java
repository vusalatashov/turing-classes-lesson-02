package az.edu.turing.module01.family;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", 5);
        Cat cat = new Cat("Simba", 2);
        Man man = new Man("Bob", 32, dog, cat);
        Woman woman = new Woman("Jane", 27, dog , cat);

        man.setCat(cat);
        man.setDog(dog);

        woman.setCat(cat);
        woman.setDog(dog);

        System.out.println(woman+"\n\n"+man);
    }
}