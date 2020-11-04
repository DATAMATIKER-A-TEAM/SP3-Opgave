import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> pizzas;

    public Menu(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public String toString() {
        String pizzaer = "";
        int counter = 0;
        for(Pizza pizza:pizzas) {
            counter++;
            pizzaer += counter + ". " + pizza.toString() + '\n';
        }

        return "Menu:\n" + pizzaer;
    }
}
