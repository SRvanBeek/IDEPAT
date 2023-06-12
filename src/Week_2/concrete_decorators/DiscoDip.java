package Week_2.concrete_decorators;

import Week_2.IceCream;
import Week_2.IcecreamDecorator;

public class DiscoDip extends IcecreamDecorator {

    public DiscoDip(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "met DiscoDip\n";
    }

    @Override
    public double getCost() {
        return 0.25 + super.getCost();
    }

    public void printDescription() {
        System.out.println(this.getDescription() + ": " + this.getCost());
    }
}
