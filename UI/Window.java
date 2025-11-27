package UI;

import javax.swing.JFrame;

public class Window extends JFrame {
  public Window() {
    this.setTitle("Pizza Menu");
    this.setSize(1200, 800);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    this.add(new MainPanel());

    this.setVisible(true);
  }
}
