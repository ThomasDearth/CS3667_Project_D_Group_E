package Pizza;

import Factories.PizzaIngredientFactory;

public class GlutenFreeCheesePizza extends Pizza {
  public GlutenFreeCheesePizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
    dough = ingredientFactory.createDough("Gluten Free Cheese");
    sauce = ingredientFactory.createSauce("Gluten Free Cheese");
    cheese = ingredientFactory.createCheese("Gluten Free Cheese");
    toppings = ingredientFactory.createToppings("Gluten Free Cheese");
  }
}
