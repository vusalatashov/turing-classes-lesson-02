package az.edu.turing.module01.lesson13;

import java.util.Objects;

public class Dog extends Animal {
    private String gender;

    public Dog(String breed, int age, String gender) {
        super(breed, age);
        this.gender = gender;
    }

    public Dog(String breed, int age) {
        super(breed, age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(gender, dog.gender);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), gender);
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
