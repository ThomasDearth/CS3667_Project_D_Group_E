package Pizza;

import Factories.BBQMeatPizzaFactory;

public class BBQMeatPizza extends Pizza {
  
  public BBQMeatPizza() {
    super(new BBQMeatPizzaFactory());
    this.name = "BBQ Meat Pizza";
  }
}
