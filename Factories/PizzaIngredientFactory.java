package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Doughs.Dough;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.Pizza;

public interface PizzaIngredientFactory {
    public Dough createDough(String pizzaType);
    public Sauce createSauce(String pizzaType);
    public Cheese createCheese(String pizzaType);
    public Toppings createToppings(String pizzaType);

    public Pizza createPizza(String pizzaType);
}
