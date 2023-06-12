package Week_2.concrete_components;

import Week_2.IceCream;

public class SorbetIjs implements IceCream {
    @Override
    public String getDescription() {
        return "SorbetIjs met: \n";
    }

    @Override
    public double getCost() {
        return 3.50;
    }
}
