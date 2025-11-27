package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Factories.PapaJohnsPizzaIngredientFactory;
import Factories.PizzaHutPizzaIngredientFactory;
import Factories.PizzaIngredientFactory;
import Pizza.Pizza;

public class MenuPanel extends JPanel implements ActionListener {
	private MainPanel parent;

	private PizzaPanel pizzaPanel;

	public MenuPanel(MainPanel parent) {
		this.parent = parent;

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		pizzaPanel = new PizzaPanel();

		setIngredientFactory(new PapaJohnsPizzaIngredientFactory());
		initializeFactorySelector();

		this.add(pizzaPanel);
	}

	public void setIngredientFactory(PizzaIngredientFactory factory) {
		parent.setIngredientFactory(factory);
		pizzaPanel.initializeMenuOptions();
	}

	/** Initializes the factory selection radio buttons. */
	private void initializeFactorySelector() {
		JRadioButton hutFactory = new JRadioButton("Pizza Hut");
		hutFactory.setActionCommand("Pizza Hut");
		hutFactory.addActionListener(this);

		JRadioButton papaFactory = new JRadioButton("Papa John's");
		papaFactory.setActionCommand("Papa John's");
		papaFactory.addActionListener(this);

		ButtonGroup group = new ButtonGroup();
		group.add(hutFactory);
		group.add(papaFactory);

		this.add(hutFactory);
		this.add(papaFactory);
	}

	/** Listens for when a new factory is selected. */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Pizza Hut":
				setIngredientFactory(new PizzaHutPizzaIngredientFactory());
				break;
			case "Papa John's":
				setIngredientFactory(new PapaJohnsPizzaIngredientFactory());
		}
	}

	/** Anonymous inner class for displaying menu items. */
	private class PizzaPanel extends JPanel implements ActionListener {
		// private MainPanel parent;

		public PizzaPanel() {
			setBorderTitle("Menu");
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			// this.parent = parent;
		}

		/** Initializes the drop-downs on the menu. */
		private void initializeMenuOptions() {
			String[] menuOptionStrings = parent.getIngredientFactory().getMenu();

			// Rewrite the menu with new dropdowns
			this.removeAll();
			for (String item : menuOptionStrings) {
				JButton itemButton = new JButton(item);
				itemButton.addActionListener(this);

				this.add(itemButton);
			}

			// Reinitialize the panel
			this.revalidate();
			this.repaint();
		}
		
		public void setBorderTitle(String title) {
			setBorder(BorderFactory.createTitledBorder(title));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Pizza p = parent.getIngredientFactory().createPizza(e.getActionCommand());

			parent.setSelectedPizza(p);
		}

	}
}
