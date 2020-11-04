import java.util.List;

public class Menu {
    private List<Pizza> pizzas;

    public Menu(List<Pizza> pizzas) {
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
