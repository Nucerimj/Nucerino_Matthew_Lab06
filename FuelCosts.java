import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");

            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("\nInvalid input! Please enter a valid number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("\nInvalid input! Please enter a valid number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("\nInvalid input! Please enter a valid number.");
            }
        } while (!done);

        double costPer100Miles = (100 / fuelEfficiency) * gasPrice;
        double distance = gallonsInTank * fuelEfficiency;

        System.out.println("\nCost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");
    }
}
