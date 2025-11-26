package Pizza;

import Factories.BoringPizzaFactory;

public class BoringPizza extends Pizza {
    public BoringPizza() {
        super(new BoringPizzaFactory());
        name = "Cheese Pizza";
    }
}
