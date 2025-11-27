package PizzaStores;

import Factories.PapaJohnsPizzaIngredientFactory;
import Factories.PizzaIngredientFactory;
import Pizza.Pizza;

public class PapaJohnsStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        PizzaIngredientFactory ingredientFactory = new PapaJohnsPizzaIngredientFactory();
        
        Pizza pizza = ingredientFactory.createPizza(pizzaType);
        return pizza;
    }
}
