package facade;

public class Waiter {

    public static String deliverFood(FoodType foodType){
        Ingredients ingredients = new Ingredients();
        switch(foodType){
            case PASTA:
                Food pasta = new Pasta();
                String pastaItems = ingredients.getPastaItems();
                pasta.prepareFood(pastaItems);
                return pasta.deliverFood();
            case PIJJA:
                Food pijja = new Pijja();
                String pijjaitems = ingredients.getPijjaItems();
                pijja.prepareFood(pijjaitems);
                return pijja.deliverFood();
        }
        return null;
    }
}
