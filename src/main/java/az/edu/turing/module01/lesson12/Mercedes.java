package az.edu.turing.module01.lesson12;

public class Mercedes extends Car{
    private boolean flying;


    public Mercedes(String model, int year, String color, int price, boolean flying) {
        super(model, year, color, price);
        this.flying = flying;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "flying=" + flying +
                "} " + super.toString();
    }
}
