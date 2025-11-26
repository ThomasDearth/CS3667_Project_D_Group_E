import Pizza.BBQMeatPizza;
import Pizza.Pizza;

public class ConsoleTest {
  public static void main(String[] args) {
    Pizza p = new BBQMeatPizza();

    System.out.println(p.getClass());
  }
}
