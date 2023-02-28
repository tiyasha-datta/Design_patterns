package facade;

public class Main {
    public static void main(String[] args) {

        System.out.println(Waiter.deliverFood(FoodType.PIJJA));
        System.out.println((Waiter.deliverFood(FoodType.PASTA)));
    }
}
