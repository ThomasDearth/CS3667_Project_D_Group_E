package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Factories.IngredientFactory;

public class MenuPanel extends JPanel implements ActionListener {
	private MainPanel parent;
	
	private String[] menuItems;

	private JPanel pizzaPanel;

	public MenuPanel(MainPanel parent) {
		this.parent = parent;

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		initializeFactorySelector();

		pizzaPanel = new JPanel();
		pizzaPanel.setBorder(BorderFactory.createTitledBorder("Menu"));

		this.add(pizzaPanel);
	}

	public void setIngredientFactory(IngredientFactory factory) {
		parent.setIngredientFactory(factory);
		// TODO: set menuItems using the selected factory
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

	/** Initializes the drop-downs on the menu. */
	private void initializeMenuOptions() {
		
	}

	/** Listens for when a new factory is selected. */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO: switch factories appropriately
		System.out.println(e.getActionCommand());
	}
}
