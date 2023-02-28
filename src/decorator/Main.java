package decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateChip(new ChocolateScoop(new ChocolateSyrup(new ChocolateCone())));
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
