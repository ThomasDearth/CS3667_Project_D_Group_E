package Factories;

import Ingredients.BBQSauce;
import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.GooeyCheese;
import Ingredients.NormalDough;
import Ingredients.Sauce;
import Ingredients.TheMeat;
import Ingredients.Toppings;

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
}
