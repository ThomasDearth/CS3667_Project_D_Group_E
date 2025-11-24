package Pizza;

import Factories.IngredientFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
        name = "Cheese Pizza";
    }
}
