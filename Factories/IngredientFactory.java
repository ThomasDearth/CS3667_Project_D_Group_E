package Factories;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Toppings;
import Pizza.Pizza;

public interface IngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Toppings createToppings();
    
    public Pizza createPizza();
}
