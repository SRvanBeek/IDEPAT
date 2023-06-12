package Week_1;

public class PayPalStrategy implements PaymentStrategy{
    @Override
    public String pay() {

        return "Pay with PayPal";
    }
}
