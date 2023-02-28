package decorator;

public class ChocolateScoop implements IceCream{

    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " ChocolateScoop";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }
}
