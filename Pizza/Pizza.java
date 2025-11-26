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

    /** Creates a new Pizza using the properties from the factory provided.
     * 
     * @param ingredientFactory The factory which specifies what ingredients compose the pizza.
     */
    public Pizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }
    
    /** Initializes the ingredient fields with information from the factory. */
    private void prepare() { // initializes ingredients
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        toppings = ingredientFactory.createToppings();
    }

    /** Returns a human-readable name for the pizza. */
    public String getName() {
      return name;
    }

    /** Returns a four-line list of ingredients for the pizza. */
    public String getIngredientNames() {
      String ingredientList = "";
      ingredientList = ingredientList.concat("Dough: " + getDoughName());
      ingredientList = ingredientList.concat("\nSauce: " + getSauceName());
      ingredientList = ingredientList.concat("\nCheese: " + getCheeseName());
      ingredientList = ingredientList.concat("\nToppings: " + getToppingNames());

      return ingredientList;
    }

    public String getDoughName() { return dough.getName(); }
    public String getSauceName() { return sauce.getName(); }
    public String getCheeseName() { return cheese.getName(); }
    public String getToppingNames() { return toppings.getName(); }
}