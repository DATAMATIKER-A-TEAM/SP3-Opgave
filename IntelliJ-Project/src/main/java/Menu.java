import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> pizzas;

    public Menu(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                '}';
    }
}
