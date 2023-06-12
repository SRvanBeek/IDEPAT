package Week_2.concrete_decorators;

import Week_2.IceCream;
import Week_2.IcecreamDecorator;

public class Oreo extends IcecreamDecorator {

    public Oreo(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "met Oreo\n";
    }

    @Override
    public double getCost() {
        return 0.75 + super.getCost();
    }

    public void printDescription() {
        System.out.println(this.getDescription() + ": " + this.getCost());
    }
}
