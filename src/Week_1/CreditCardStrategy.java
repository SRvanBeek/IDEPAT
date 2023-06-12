package Week_1;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public String pay() {
        return "Pay with Credit Card";
    }
}
