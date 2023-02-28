package decorator;

public class ChocolateChip implements IceCream{

    private IceCream iceCream;

    public ChocolateChip(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " ChocolateChip";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }
}
