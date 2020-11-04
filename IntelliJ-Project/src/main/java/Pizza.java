public class Pizza {
	private String name, components;
	private int price;
	private boolean news;
	private static int pizzaCounter = 0;

	public Pizza(String name, String components, int price, boolean news) {
		this.name = name;
		this.components = components;
		this.price = price;
		this.news = news;
		pizzaCounter++;
	}

	public Pizza(String name, String components, int price) {
		this.name = name;
		this.components = components;
		this.price = price;
		this.news = false;
		pizzaCounter++;
	}

	public static int getPizzaCounter() {
		return pizzaCounter;
	}

	@Override
	public String toString() {
		String newPizza = "";
		if(news) {
			newPizza = "NYHED*";
		}
		return name + ':' + newPizza + ' ' +  components + ' ' + price;
	}
}
