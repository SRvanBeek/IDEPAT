package Week_2;

public abstract class IcecreamDecorator implements IceCream{
    IceCream wrappedIceCream;

    public IcecreamDecorator(IceCream iceCream) {
        this.wrappedIceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return wrappedIceCream.getDescription();
    }
    @Override
    public double getCost() {
        return wrappedIceCream.getCost();
    }

}
