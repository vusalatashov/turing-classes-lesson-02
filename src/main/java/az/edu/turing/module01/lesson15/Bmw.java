package az.edu.turing.module01.lesson15;

public class Bmw extends Transport{

    public Bmw(String transportName, String type) {
        super(transportName, type);
    }

    @Override
    public void transport() {
        System.out.println("Bmw");
    }
}
