package Pizza;

import Factories.MargheritaPizzaFactory;

public class MargheritaPizza extends Pizza {
  public MargheritaPizza() {
    super(new MargheritaPizzaFactory());
    this.name = "Margherita Pizza";
  }
}
