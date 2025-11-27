package Pizza;

import Factories.PizzaIngredientFactory;

public class MargheritaPizza extends Pizza {
  public MargheritaPizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
    dough = ingredientFactory.createDough("Margherita");
    sauce = ingredientFactory.createSauce("Margherita");
    cheese = ingredientFactory.createCheese("Margherita");
    toppings = ingredientFactory.createToppings("Margherita");
  }
}
