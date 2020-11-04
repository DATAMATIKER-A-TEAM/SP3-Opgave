import java.util.Scanner;

public class MainController {
    private final Menu menu;
    private boolean running;
    public MainController(Menu menu) {
        this.menu = menu;
    }

    public void runProgram() {
        running = true;
        while(running) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            menuAction(userInput);
        }
    }

    private void menuAction(String userInput) {
        switch(userInput) {
            case "1":
                System.out.println(menu.toString());
                break;
            case "2": running = false; break;
            default: System.out.println("Unknown command"); break;
        }
    }

    public void showMenu() {
        System.out.println("1) Show Menu");
        System.out.println("2) Quit");
    }
}
