package Ingredients;

public abstract class Toppings {
    String name;

    public Toppings(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
}
