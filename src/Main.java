import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Barbershop! Choose desired master");
        System.out.println("1. Men");
        System.out.println("2. Women");
        System.out.println("3. Children");
        int choice = scanner.nextInt();
        ServeBehavior baseService = ServiceFactory.createService(choice);
        System.out.println("Do you want hair washing (1 for yes, 0 for no): ");
        int hairWashingChoice = scanner.nextInt();
        if (hairWashingChoice == 1) {
            baseService = new HairWashingDecorator(baseService);
        }
        System.out.println("Do you want a massage (1 for yes, 0 for no): ");
        int massageChoice = scanner.nextInt();
        if (massageChoice == 1) {
            baseService = new MassageDecorator(baseService);
        }
        Barber barber = new Barber(baseService);
        barber.serve();
    }
}
