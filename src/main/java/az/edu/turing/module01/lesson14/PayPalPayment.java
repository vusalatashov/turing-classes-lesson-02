package az.edu.turing.module01.lesson14;

public class PayPalPayment extends Payment {
    public PayPalPayment(int amount) {
        super(amount);
    }

    @Override
    public double pay(double amount) {
        return amount*5;
    }
}
