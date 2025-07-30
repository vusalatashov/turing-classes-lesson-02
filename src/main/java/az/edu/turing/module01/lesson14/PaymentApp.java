package az.edu.turing.module01.lesson14;

public class PaymentApp {
    public static void main(String[] args) {
        Payment card = new CardPayment(4);
        Payment paypal = new PayPalPayment(4);
        System.out.println(card.pay(10));
        System.out.println(paypal.pay(10));
        //FileReader java =new Java();
        //FileReader word =new Word();
        //FileReader excel =new Excel();
        // java.read()
        // word.read()
        // excel.read()

//        Payment paypal2 = new Payment(4);
    }
}
