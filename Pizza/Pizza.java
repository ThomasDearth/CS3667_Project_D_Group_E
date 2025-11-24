package Pizza;

import Factories.IngredientFactory;
import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Toppings;

public abstract class Pizza {
    IngredientFactory ingredientFactory; // the ingredient factory which will prepare this pizza
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Toppings toppings;
    String name;

    public Pizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }
    
    public void prepare() { // initializes ingredients
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        toppings = ingredientFactory.createToppings();
    }

}