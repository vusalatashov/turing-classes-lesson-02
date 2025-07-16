package az.edu.turing.module01.family;

public class Cat extends Animal{

    public Cat(){};

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "Cat = {\n " +
                "Name: " + super.getName() +
                "\n Age: " + super.getAge() +
                "\n}";
    }
}