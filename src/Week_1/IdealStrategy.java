package Week_1;

public class IdealStrategy implements PaymentStrategy{
    @Override
    public String pay() {
        return "Pay with Ideal";
    }
}
