package Factories;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.NoCheese;
import Ingredients.NoSauce;
import Ingredients.NoToppings;
import Ingredients.NormalDough;
import Ingredients.Sauce;
import Ingredients.Toppings;
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
