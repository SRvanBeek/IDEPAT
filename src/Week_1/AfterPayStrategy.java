package Week_1;

public class AfterPayStrategy implements PaymentStrategy{
    @Override
    public String pay() {

        return "Pay with AfterPay";
    }
}
