package PizzaStores;

import Factories.PizzaHutPizzaIngredientFactory;
import Factories.PizzaIngredientFactory;
import Pizza.Pizza;

public class PizzaHutStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        PizzaIngredientFactory ingredientFactory = new PizzaHutPizzaIngredientFactory();
        
        Pizza pizza = ingredientFactory.createPizza(pizzaType);
        return pizza;
    }
}