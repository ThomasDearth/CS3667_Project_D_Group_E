package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Doughs.Dough;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.Pizza;

public class PizzaHutPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough(String pizzaType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createDough'");
  }

  @Override
  public Sauce createSauce(String pizzaType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createSauce'");
  }

  @Override
  public Cheese createCheese(String pizzaType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createCheese'");
  }

  @Override
  public Toppings createToppings(String pizzaType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createToppings'");
  }

  @Override
  public Pizza createPizza(String pizzaType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createPizza'");
  }

  @Override
  public String[] getMenu() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMenu'");
  }

  @Override
  public String getRestaurantName() {
    return "Pizza Hut";
  }

}