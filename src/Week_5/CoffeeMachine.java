package Week_5;

import Week_5.Concrete_States.*;

public class CoffeeMachine {
    private State currentState;

    private IdleState idleState = new IdleState(this);
    private ErrorState errorState = new ErrorState(this);
    private CleaningState cleaningState = new CleaningState(this);
    private PaymentProvidedState awaitPaymentState = new PaymentProvidedState(this);
    private BrewingState brewingState = new BrewingState(this);

    public CoffeeMachine() {
        this.currentState = idleState;
    }

    public void brewCoffee() {
        currentState.brewCoffee();
    }

    public void cancel() {
        currentState.cancel();
    }

    public void clean() {
        currentState.clean();
    }

    public void pay() {
        currentState.pay();
    }

    public void repair() {
        currentState.repair();
    }


    public State getCurrentState() {
        return currentState;
    }

    public IdleState getIdleState() {
        return idleState;
    }

    public ErrorState getErrorState() {
        return errorState;
    }

    public CleaningState getCleaningState() {
        return cleaningState;
    }

    public PaymentProvidedState getAwaitPaymentState() {
        return awaitPaymentState;
    }

    public BrewingState getBrewingState() {
        return brewingState;
    }

}
