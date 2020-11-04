import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private final Menu menu;
    private boolean running;
    Scanner scanner = new Scanner(System.in);

    private List<Orders> orders = new ArrayList<>();

    public MainController(Menu menu) {
        this.menu = menu;
    }

    public void runProgram() {
        running = true;
        while(running) {
            showMenu();
            String userInput = scanner.nextLine();

            menuAction(userInput);
        }
    }

    private void menuAction(String userInput) {
        switch(userInput) {
            case "1":
                System.out.println(menu.toString());
                break;
            case "2": newOrder(); break;
            case "3": running = false; break;
            default: System.out.println("Unknown command"); break;
        }
    }

    private void showMenu() {
        System.out.println("1) Show Menu");
        System.out.println("2) Opret Bestilling");
        System.out.println("3) Quit");
    }

    private void newOrder() {
        System.out.println("Indtast navn:");
        String customerName = scanner.nextLine();

        System.out.println("Indtast nummer");
        String number = scanner.nextLine();

        List<Pizza> orderPizza = new ArrayList<>();
        boolean orderDone = false;
        while(!orderDone) {
            boolean orderIDCorrect = false;
            while(!orderIDCorrect) {
                try {
                    System.out.println("Indtast ordre [ID]");
                    int order = Integer.parseInt(scanner.nextLine());
                    orderPizza.add(menu.getPizza(order));
                    orderIDCorrect = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ugyldigt ID!");
                }
            }

            System.out.println("flere ordrer? [yes/no]");
            String moreOrders = scanner.nextLine();

            if(moreOrders.equals("no")) {
                orderDone = true;
            }
        }

        orders.add(new Orders(customerName, number, orderPizza));
    }
}
