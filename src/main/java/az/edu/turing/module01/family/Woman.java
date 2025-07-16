package az.edu.turing.module01.family;

public class Woman extends Human{

    public Woman(){};

    public Woman(String name, int age){
        super(name, age);
    }

    public Woman(String name, int age, Dog dog, Cat cat){
        super(name, age, dog, cat);
    }

    @Override
    public String toString() {
        return "Woman{" +
                "dog=" + dog +
                ", cat=" + cat +
                "} " + super.toString();
    }
}