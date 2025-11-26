package Factories;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.GlutenFreeDough;
import Ingredients.GooeyCheese;
import Ingredients.NoToppings;
import Ingredients.NormalSauce;
import Ingredients.Sauce;
import Ingredients.Toppings;
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
