package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Doughs.Dough;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.Pizza;

public interface IngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Toppings createToppings();
    
    public Pizza createPizza();
}
