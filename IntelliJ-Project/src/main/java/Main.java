public class Main {
	private static Menu menu;
	public static void main(String[] args) {
		initiatePizza();
	}

	private static void initiatePizza() {
		Pizza pizza1 = new Pizza("Vesuvio", "tomatsauce, ost, skinke og oregano", 57);
		Pizza pizza2 = new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53, true);
		Pizza pizza3 = new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
		Pizza pizza4 = new Pizza("Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63, true);
		Pizza pizza5 = new Pizza("Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65, true);
		Pizza pizza6 = new Pizza("Bertil", "tomatsauce, ost, bacon og oregano", 57);
		Pizza pizza7 = new Pizza("Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61);
		Pizza pizza8 = new Pizza("Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
		Pizza pizza9 = new Pizza("Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chilli og oregano", 61, true);
		Pizza pizza10 = new Pizza("Capricciosa", "tomatsauce, ost, skinke, champignon, oregano", 61);
		Pizza pizza11 = new Pizza("Hawai", "tomatsauce, ost, skinke, ananas, oregano", 61);
		Pizza pizza12 = new Pizza("Le blissola", "tomatsauce, ost, skinke, rejer og oregano", 61);
		Pizza pizza13 = new Pizza("Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61);
		Pizza pizza14 = new Pizza("Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);
	}
}
