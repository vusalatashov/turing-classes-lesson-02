package az.edu.turing.module01.lesson14;

public class CardPayment extends Payment {

    public CardPayment(int amount) {
        super(amount);
    }

    @Override
    public double pay(double amount) {
        return amount * 1 ;
    }
}
