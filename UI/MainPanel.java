package UI;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import Factories.PizzaIngredientFactory;
import Pizza.Pizza;

public class MainPanel extends JPanel {
  private JPanel menuSelectPanel;
  private PizzaDisplayPanel displayPizzaPanel;


  private PizzaIngredientFactory selectedFactory;
  private Pizza selectedPizza;

  public MainPanel() {
    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    
    menuSelectPanel = new MenuPanel(this);
    displayPizzaPanel = new PizzaDisplayPanel();

    this.add(menuSelectPanel);
    this.add(displayPizzaPanel);
  }

  public void setIngredientFactory(PizzaIngredientFactory factory) {
    this.selectedFactory = factory;
  }

  public PizzaIngredientFactory getIngredientFactory() {
    return selectedFactory;
  }

  public void setSelectedPizza(Pizza pizza) {
    this.selectedPizza = pizza;
    displayPizzaPanel.showPizza(pizza);
  }

  public Pizza getSelectedPizza() {
    return this.selectedPizza;
  }
}
