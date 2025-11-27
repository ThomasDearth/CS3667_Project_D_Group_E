package UI;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import Factories.PizzaIngredientFactory;

public class MainPanel extends JPanel {
  private JPanel menuSelectPanel;
  private JPanel pizzaCreatePanel;
  private JPanel displayPizzaPanel;

  private PizzaIngredientFactory selectedFactory;

  public MainPanel() {
    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    
    menuSelectPanel = new MenuPanel(this);
    pizzaCreatePanel = new JPanel();  // TODO: create dedicated class
    displayPizzaPanel = new JPanel(); // TODO: create dedicated class

    this.add(menuSelectPanel);
    this.add(pizzaCreatePanel);
    this.add(displayPizzaPanel);
  }

  public void setIngredientFactory(PizzaIngredientFactory factory) {
    this.selectedFactory = factory;
  }

  public PizzaIngredientFactory getIngredientFactory() {
    return selectedFactory;
  }
}
