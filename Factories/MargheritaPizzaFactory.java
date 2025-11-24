package Factories;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.GooeyCheese;
import Ingredients.NormalDough;
import Ingredients.OliveOil;
import Ingredients.Sauce;
import Ingredients.TomatoAndBasil;
import Ingredients.Toppings;

public class MargheritaPizzaFactory implements IngredientFactory {
    public Dough createDough() {
        return new NormalDough();
    }

    public Sauce createSauce() {
        return new OliveOil();
    }

    public Cheese createCheese() {
        return new GooeyCheese();
    }

    public Toppings createToppings() {
        return new TomatoAndBasil();
    }
}
