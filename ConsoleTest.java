import java.util.ArrayList;

import Pizza.Pizza;
import PizzaStores.PapaJohnsStore;

public class ConsoleTest {
  public static void main(String[] args) {
    PapaJohnsStore myPapaJohnStore = new PapaJohnsStore();
    ArrayList<Pizza> myPizzas = new ArrayList<Pizza>();
    myPizzas.add(myPapaJohnStore.createPizza("BBQ Meat"));
    myPizzas.add(myPapaJohnStore.createPizza("Gluten Free Cheese"));
    myPizzas.add(myPapaJohnStore.createPizza("Margherita"));
    myPizzas.add(myPapaJohnStore.createPizza("Boring"));
    myPizzas.add(myPapaJohnStore.createPizza("Margherita"));
    for (Pizza p : myPizzas) {
        System.out.println(p.getIngredientNames());
    }
  }
}
