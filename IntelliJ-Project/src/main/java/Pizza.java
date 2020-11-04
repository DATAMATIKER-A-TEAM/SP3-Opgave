public class Pizza {
	private final String name, components;
	private final int price;
	private final boolean news;

	public Pizza(String name, String components, int price, boolean news) {
		this.name = name;
		this.components = components;
		this.price = price;
		this.news = news;
	}

	public Pizza(String name, String components, int price) {
		this.name = name;
		this.components = components;
		this.price = price;
		this.news = false;
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
