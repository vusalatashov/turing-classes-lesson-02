package az.edu.turing.module01.lesson13;

public class Cat extends Animal {

    public String color;

    public Cat(String breed, int age, String color) {
        super(breed, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }

    public void purr() {
        System.out.println("Cat is purring");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
