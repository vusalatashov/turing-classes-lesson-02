package az.edu.turing.module01.family;

public class Human extends Animal{

    protected Dog dog;
    protected Cat cat;

    public Human(){};

    public Human(String name, int age){
        super(name, age);
    }

    public Human(String name, int age, Dog dog, Cat cat){
        super(name, age);
        this.dog = dog;
        this.cat = cat;
    }

    public Dog getDog(){
        return this.dog;
    }

    public void setDog(Dog dog){
        this.dog = dog;
    }

    public Cat getCat(){
        return this.cat;
    }

    public void setCat(Cat cat){
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Human{" +
                "dog=" + dog +
                ", cat=" + cat +
                "} " + super.toString();
    }
}