//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Laptop Brand:");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.print("Enter your choice (1/2/3): ");

        Laptop laptop = null;

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        LaptopUser user = new LaptopUser(laptop);

        boolean running = true;
        while (running) {
            System.out.println("\nAvailable commands:");
            System.out.println("ON - Turn On");
            System.out.println("OFF - Turn Off");
            System.out.println("UP - Increase Volume");
            System.out.println("DOWN - Decrease Volume");
            System.out.println("QUIT - Quit Program");
            System.out.print("Enter command: ");

            String command = scanner.next().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "QUIT":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}

