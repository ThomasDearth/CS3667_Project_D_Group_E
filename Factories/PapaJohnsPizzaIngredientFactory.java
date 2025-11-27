package Factories;

import Ingredients.Cheeses.Cheese;
import Ingredients.Cheeses.FancyCheese;
import Ingredients.Cheeses.NoCheese;
import Ingredients.Doughs.ChewyDough;
import Ingredients.Doughs.Dough;
import Ingredients.Doughs.GlutenFreeDough;
import Ingredients.Sauces.BBQSauce;
import Ingredients.Sauces.NoSauce;
import Ingredients.Sauces.NormalSauce;
import Ingredients.Sauces.OliveOil;
import Ingredients.Sauces.Sauce;
import Ingredients.ToppingCombinations.NoToppings;
import Ingredients.ToppingCombinations.TheMeat;
import Ingredients.ToppingCombinations.TomatoAndBasil;
import Ingredients.ToppingCombinations.Toppings;
import Pizza.BBQMeatPizza;
import Pizza.BoringPizza;
import Pizza.GlutenFreeCheesePizza;
import Pizza.MargheritaPizza;
import Pizza.Pizza;

public class PapaJohnsPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(String pizzaType) {
        Dough dough = null;
        if (pizzaType == "Gluten Free Cheese") dough = new GlutenFreeDough();
        else dough = new ChewyDough();
        return dough;
    }

    public Sauce createSauce(String pizzaType) {
        Sauce sauce = null;
        switch(pizzaType) {
            case "Gluten Free Cheese":
                sauce = new NormalSauce();
                break;
            case "Margherita":
                sauce = new OliveOil();
                break;
            case "BBQ Meat":
                sauce = new BBQSauce();
                break;
            case "Boring":
                sauce = new NoSauce();
                break;
            default:
                /* TODO: Handle cases where type matches none given. */
        }
        return sauce;
    }

    public Cheese createCheese(String pizzaType) {
        Cheese cheese = null;
        switch(pizzaType) {
            case "Gluten Free Cheese":
                cheese = new FancyCheese();
                break;
            case "Margherita":
                cheese = new FancyCheese();
                break;
            case "BBQ Meat":
                cheese = new FancyCheese();
                break;
            case "Boring":
                cheese = new NoCheese();
                break;
            default:
                /* TODO: Handle cases where type matches none given. */
        }
        return cheese;
    }

    public Toppings createToppings(String pizzaType) {
        Toppings toppings = null;
        switch(pizzaType) {
            case "Gluten Free Cheese":
                toppings = new NoToppings();
                break;
            case "Margherita":
                toppings = new TomatoAndBasil();
                break;
            case "BBQ Meat":
                toppings = new TheMeat();
                break;
            case "Boring":
                toppings = new NoToppings();
                break;
            default:
                /* TODO: Handle cases where type matches none given. */
        }
        return toppings;
    }

    // this returns a string with all pizzas this factory can make
    public String[] getMenu() {
        String[] menu = {"Gluten Free Cheese Pizza", "Margherita Pizza", "BBQ Meat Pizza", "Boring Pizza"};
        return menu;
    }

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case "Gluten Free Cheese":
                pizza = new GlutenFreeCheesePizza(this);
                pizza.setName("Papa Johns Gluten Free Cheese Pizza");
                break;
            case "Margherita":
                pizza = new MargheritaPizza(this);
                pizza.setName("Papa Johns Margherita Pizza");
                break;
            case "BBQ Meat":
                pizza = new BBQMeatPizza(this);
                pizza.setName("Papa Johns BBQ Meat Pizza");
                break;
            case "Boring":
                pizza = new BoringPizza(this);
                pizza.setName("Papa Johns Boring Pizza");
                break;
            default:
                /* TODO: Handle cases where type matches none given. */
        }
        return pizza;
    }
}