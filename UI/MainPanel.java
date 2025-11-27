package UI;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import Factories.IngredientFactory;

public class MainPanel extends JPanel {
  private JPanel menuSelectPanel;
  private JPanel pizzaCreatePanel;
  private JPanel displayPizzaPanel;

  private IngredientFactory selectedFactory;

  public MainPanel() {
    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    
    menuSelectPanel = new MenuPanel(this);
    pizzaCreatePanel = new JPanel();  // TODO: create dedicated class
    displayPizzaPanel = new JPanel(); // TODO: create dedicated class

    this.add(menuSelectPanel);
    this.add(pizzaCreatePanel);
    this.add(displayPizzaPanel);
  }

  public void setIngredientFactory(IngredientFactory factory) {
    this.selectedFactory = factory;
  }

  public IngredientFactory getIngredientFactory() {
    return selectedFactory;
  }
}
