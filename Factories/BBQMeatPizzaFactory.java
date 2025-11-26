package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Cheeses.GooeyCheese;
import Ingredients.Doughs.Dough;
import Ingredients.Doughs.NormalDough;
import Ingredients.Sauces.BBQSauce;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.TheMeat;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.BBQMeatPizza;
import Pizza.Pizza;

public class BBQMeatPizzaFactory implements IngredientFactory {
    public Dough createDough() {
        return new NormalDough();
    }

    public Sauce createSauce() {
        return new BBQSauce();
    }

    public Cheese createCheese() {
        return new GooeyCheese();
    }

    public Toppings createToppings() {
        return new TheMeat();
    }

    @Override
    public Pizza createPizza() {
      return new BBQMeatPizza();
    }
}
