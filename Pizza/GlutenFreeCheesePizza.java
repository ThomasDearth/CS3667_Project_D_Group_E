package Pizza;

import Factories.GlutenFreeCheesePizzaFactory;

public class GlutenFreeCheesePizza extends Pizza {
  public GlutenFreeCheesePizza() {
    super(new GlutenFreeCheesePizzaFactory());
    this.name = "Gluten Free Cheese Pizza";
  }
}
