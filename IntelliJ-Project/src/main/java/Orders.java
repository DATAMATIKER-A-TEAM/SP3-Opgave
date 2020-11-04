import java.util.ArrayList;
import java.util.List;

public class Orders {
	private List<Pizza> orders = new ArrayList<>();
	private final String customerName, number;
	private int price = 0;

	public Orders(String customerName, String number, List<Pizza> orders) {
		this.customerName = customerName;
		this.number = number;
		this.orders = orders;
	}

}
