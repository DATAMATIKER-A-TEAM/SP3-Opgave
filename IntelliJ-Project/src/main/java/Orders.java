import java.util.ArrayList;
import java.util.List;

public class Orders {
	private List<Pizza> orders = new ArrayList<>();
	private final String customerName;
	private int price = 0;

	public Orders(String customerName) {
		this.customerName = customerName;
	}

	public void addPizza(Pizza pizza) {
		orders.add(pizza);
		price += pizza.getPrice();
	}
}
