package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Cheeses.GooeyCheese;
import Ingredients.Doughs.Dough;
import Ingredients.Doughs.GlutenFreeDough;
import Ingredients.Sauces.NormalSauce;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.NoToppings;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.Pizza;

public class GlutenFreeCheesePizzaFactory implements IngredientFactory {
    public Dough createDough() {
        return new GlutenFreeDough();
    }

    public Sauce createSauce() {
        return new NormalSauce();
    }

    public Cheese createCheese() {
        return new GooeyCheese();
    }

    public Toppings createToppings() {
        return new NoToppings();
    }

    @Override
    public Pizza createPizza() {
      // TPDO: auto-generated method stub
      return null;
    }
}
