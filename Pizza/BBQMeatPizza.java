package Pizza;

import Factories.PizzaIngredientFactory;

public class BBQMeatPizza extends Pizza {
  public BBQMeatPizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
    dough = ingredientFactory.createDough("BBQ Meat");
    sauce = ingredientFactory.createSauce("BBQ Meat");
    cheese = ingredientFactory.createCheese("BBQ Meat");
    toppings = ingredientFactory.createToppings("BBQ Meat");
  }
}
