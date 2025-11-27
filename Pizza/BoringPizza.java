package Pizza;

import Factories.PizzaIngredientFactory;

public class BoringPizza extends Pizza {
  public BoringPizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
    dough = ingredientFactory.createDough("Boring");
    sauce = ingredientFactory.createSauce("Boring");
    cheese = ingredientFactory.createCheese("Boring");
    toppings = ingredientFactory.createToppings("Boring");
  }
}