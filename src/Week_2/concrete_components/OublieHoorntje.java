package Week_2.concrete_components;

import Week_2.IceCream;

public class OublieHoorntje implements IceCream {

    @Override
    public String getDescription() {
        return "Oubliehoortje met: \n";
    }

    @Override
    public double getCost() {
        return 1.25;
    }
}
