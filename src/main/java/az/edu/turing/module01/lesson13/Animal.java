package az.edu.turing.module01.lesson13;

import java.util.Objects;

public class Animal {
    private String breed;
    private int age;

    public Animal(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return breed;
    }

    public void setName(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.age == animal.age;
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(breed, age);
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
