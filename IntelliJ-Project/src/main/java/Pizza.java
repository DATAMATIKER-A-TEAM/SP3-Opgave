public class Pizza {
	private final String name, components;
	private final int price;
	private final boolean news;
	private static int counter = 0;
	private int id;

	public Pizza(String name, String components, int price, boolean news) {
		this.name = name;
		this.components = components;
		this.price = price;
		this.news = news;
		counter++;
		this.id = counter;
	}

	public Pizza(String name, String components, int price) {
		this.name = name;
		this.components = components;
		this.price = price;
		this.news = false;
		counter++;
		this.id = counter;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		String newPizza = "";
		if(news) {
			newPizza = "NYHED*";
		}
		return name + ':' + newPizza + ' ' +  components + " ... " + price + "DKK";
	}
}
