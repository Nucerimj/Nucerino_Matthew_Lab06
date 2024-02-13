import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("\nInvalid input! Please enter a valid temperature.");
            }
        } while (!done);

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("\nEquivalent temperature in Fahrenheit: " + fahrenheit);
    }
}
