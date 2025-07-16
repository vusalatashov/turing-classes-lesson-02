package az.edu.turing.module01.lesson12;

public class Moto {
    private String model;
    private int year;
    private String color;
    private int price;

    public Moto(String model, int year, String color, int price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
