import java.util.List;

public class Menu {
    private final List<Pizza> pizzas;

    public Menu(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Pizza getPizza(int id) {
        return pizzas.get(id);
    }

    @Override
    public String toString() {
        StringBuilder pizzas = new StringBuilder();
        int counter = 0;
        for(Pizza pizza: this.pizzas) {
            counter++;
            pizzas.append(counter).append(". ").append(pizza.toString()).append('\n');
        }

        return "Menu:\n" + pizzas;
    }
}
