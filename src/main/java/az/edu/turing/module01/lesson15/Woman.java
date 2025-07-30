package az.edu.turing.module01.lesson15;

public class Woman extends Human{

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
