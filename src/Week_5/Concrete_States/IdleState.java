package Week_5.Concrete_States;

import Week_5.CoffeeMachine;
import Week_5.State;

public class IdleState implements State {
    private CoffeeMachine coffeeMachine;

    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void brewCoffee() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void clean() {

    }

    @Override
    public void pay() {

    }

    @Override
    public void repair() {

    }

}
