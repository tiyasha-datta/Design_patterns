package decorator;

public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    public ChocolateCone(){

    }

    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate cone";
        }else{
            return iceCream.getDescription() + " Chocolate Cone";
        }
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 20;
        }else{
            return iceCream.getCost() + 10;
        }
    }
}
