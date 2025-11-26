package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Cheeses.GooeyCheese;
import Ingredients.Doughs.Dough;
import Ingredients.Doughs.NormalDough;
import Ingredients.Sauces.OliveOil;
import Ingredients.Sauces.Sauce;
import Ingredients.Sauces.TomatoAndBasil;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.Pizza;

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
    
    @Override
    public Pizza createPizza() {
      // TODO Auto-generated method stub
      return null;
    }
}
