package decorator;

public class ChocolateSyrup implements IceCream{

    private IceCream iceCream;

    public ChocolateSyrup(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " ChocolateSyrup";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }
}
