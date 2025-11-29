package UI;

import javax.swing.*;
import Pizza.Pizza;
import java.awt.*;

/**
 * Panel to display the currently selected pizza.
 * Depends only on abstract Pizza type.
 */
public class PizzaDisplayPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    // UI components
    private final JLabel nameLabel;
    private final JTextArea ingredientsTextArea;

    // Constructor
    public PizzaDisplayPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Selected Pizza"));

        nameLabel = new JLabel("No pizza selected");
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        add(nameLabel, BorderLayout.NORTH);

        ingredientsTextArea = new JTextArea();
        ingredientsTextArea.setEditable(false);
        ingredientsTextArea.setLineWrap(true);
        ingredientsTextArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(ingredientsTextArea);
        add(scroll, BorderLayout.CENTER);
    }

    // Updates the panel to show the given pizza's details
    public void showPizza(Pizza pizza) {
        if (pizza == null) {
            nameLabel.setText("No pizza selected");
            ingredientsTextArea.setText("");
        } else {
            nameLabel.setText(pizza.getName());
            String ingredients = pizza.getIngredients();
            ingredientsTextArea.setText(ingredients);
        }
        revalidate();
        repaint();
    }
}
