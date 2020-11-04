import java.util.ArrayList;

public class Main {
	private static MainController controller;
	public static void main(String[] args) {
		initiatePizza();
		controller.showMenu();
		controller.runProgram();
	}

	private static void initiatePizza() {
		ArrayList<Pizza> pizzas = new ArrayList<>();
		Menu menu;

		pizzas.add(new Pizza("Vesuvio", "tomatsauce, ost, skinke og oregano", 57));
		pizzas.add(new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53, true));
		pizzas.add(new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57));
		pizzas.add(new Pizza("Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63, true));
		pizzas.add(new Pizza("Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65, true));
		pizzas.add(new Pizza("Bertil", "tomatsauce, ost, bacon og oregano", 57));
		pizzas.add(new Pizza("Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61));
		pizzas.add(new Pizza("Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61));
		pizzas.add(new Pizza("Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chilli og oregano", 61, true));
		pizzas.add(new Pizza("Capricciosa", "tomatsauce, ost, skinke, champignon, oregano", 61));
		pizzas.add(new Pizza("Hawai", "tomatsauce, ost, skinke, ananas, oregano", 61));
		pizzas.add(new Pizza("Le blissola", "tomatsauce, ost, skinke, rejer og oregano", 61));
		pizzas.add(new Pizza("Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61));
		pizzas.add(new Pizza("Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61));

		menu = new Menu(pizzas);
		controller = new MainController(menu);
	}
}
