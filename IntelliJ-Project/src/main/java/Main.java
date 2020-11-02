import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {

	}

	private static void initiatePizza() {
		Pizza pizza1 = new Pizza("Vesuvio", "tomatsauce, ost, skinke og oregano", 57);
		Pizza pizza2 = new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53, true);
		Pizza pizza3 = new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
		Pizza pizza4 = new Pizza("Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63, true);
	}

	@Override
	public void start(Stage primaryStage) {

	}
}
