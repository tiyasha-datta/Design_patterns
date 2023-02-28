package facade;

public class Pasta implements Food{
    private String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {

        preparedItem = "tomato pasta with ingredients " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
