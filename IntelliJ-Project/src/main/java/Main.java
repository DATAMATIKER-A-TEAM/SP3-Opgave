import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static MainController controller;
	public static void main(String[] args) {
		initiatePizza();
		controller.runProgram();
	}

	private static void initiatePizza() {
		List<Pizza> pizzas = new ArrayList<>();
		Menu menu;

		File file = new File("Resources/menu.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();

			while(line != null) {
				String [] lineArr = line.split(";");
				boolean news = false;
				if(lineArr.length == 4) news = true;

				pizzas.add(new Pizza(lineArr[0], lineArr[1], Integer.parseInt(lineArr[2]), news));

				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		menu = new Menu(pizzas);
		controller = new MainController(menu);
	}
}
