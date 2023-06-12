package Week_1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    private PaymentStrategy paymentStrategy;
    private final Scanner scanner = new Scanner(System.in);

    public void selectPayment() {
        System.out.println("""
                Please select a payment option:
                 -----------------
                1: Ideal
                2: Credit Card
                3: PayPal
                4: AfterPay
                \s
                """);

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> setPaymentStrategy(new IdealStrategy());
            case 2 -> setPaymentStrategy(new CreditCardStrategy());
            case 3 -> setPaymentStrategy(new PayPalStrategy());
            case 4 -> setPaymentStrategy(new AfterPayStrategy());
            default -> throw new InputMismatchException("please select a valid option!");
        }

    }

    private void confirmPayment() {
        System.out.println("type 'pay' to pay!!!!");

        if (scanner.hasNext("pay")) {
            System.out.println(paymentStrategy.pay());
        }
        else {
            System.out.println("Payment aborted");
        }
        System.out.println("-----------------\n");
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public static void main(String[] args) {
        while (true) {
            User user = new User();
            user.selectPayment();
            user.confirmPayment();
        }
    }
}