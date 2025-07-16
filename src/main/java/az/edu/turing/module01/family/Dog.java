package az.edu.turing.module01.family;

public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "Dog = {\n " +
                "Name: " + super.getName() +
                "\n Age: " + super.getAge() +
                "\n}";
    }
}