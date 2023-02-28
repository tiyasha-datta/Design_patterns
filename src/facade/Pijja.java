package facade;

public class Pijja implements Food{

    private String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {

        preparedItem = "thin curst pijja with ingredients " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
