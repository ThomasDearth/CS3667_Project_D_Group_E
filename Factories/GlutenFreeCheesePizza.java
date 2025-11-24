package Factories;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.GlutenFreeDough;
import Ingredients.GooeyCheese;
import Ingredients.NoToppings;
import Ingredients.NormalSauce;
import Ingredients.Sauce;
import Ingredients.Toppings;

public class GlutenFreeCheesePizza implements IngredientFactory {
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
}
