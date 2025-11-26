package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Cheeses.NoCheese;
import Ingredients.Doughs.Dough;
import Ingredients.Doughs.NormalDough;
import Ingredients.Sauces.NoSauce;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.NoToppings;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.BoringPizza;
import Pizza.Pizza;

public class BoringPizzaFactory implements IngredientFactory {
    public Dough createDough() {
        return new NormalDough();
    }

    public Sauce createSauce() {
        return new NoSauce();
    }

    public Cheese createCheese() {
        return new NoCheese();
    }

    public Toppings createToppings() {
        return new NoToppings();
    }

    @Override
    public Pizza createPizza() {
      return new BoringPizza();
    }
}
