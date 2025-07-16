package az.edu.turing.module01.family;

public class Man extends Human{

    public Man(){};

    public Man(String name, int age){
        super(name, age);
    }

    public Man(String name, int age, Dog dog, Cat cat){
        super(name, age, dog, cat);
    }

    @Override
    public String toString() {
        return "Man{" +
                "dog=" + dog +
                ", cat=" + cat +
                "} " + super.toString();
    }
}