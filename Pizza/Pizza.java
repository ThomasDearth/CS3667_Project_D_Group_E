package Pizza;

import Factories.PizzaIngredientFactory;
import Ingredients.Cheeses.Cheese;
import Ingredients.Doughs.Dough;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.Toppings;

public abstract class Pizza {
    PizzaIngredientFactory ingredientFactory; 
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Toppings toppings;
    String name;

    // Constructor
    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // Sets pizza name
    public void setName(String name) {
        this.name = name;
    }

    // Returns pizza name
    public String getName() {
        return name;
    }

    // Returns a 4-line description of ingredients
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

    // UI-friendly output: each ingredient printed line-by-line.
    public String getIngredients() {
        StringBuilder sb = new StringBuilder();
        for (String ingredient : getIngredientNames().split("\n")) {
            sb.append(ingredient).append("\n");
        }
        return sb.toString();
    }

    // Optional: nice display when printing objects
    @Override
    public String toString() {
        return getName() + "\n" + getIngredients();
    }
}
