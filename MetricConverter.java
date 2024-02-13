import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        boolean done = false;

        do {
            System.out.print("Enter a measurement in meters: ");

            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("\nInvalid input! Please enter a valid number.");
            }
        } while (!done);

        double miles = meters * 0.000621;
        double feet = meters * 3.281;
        double inches = meters * 39.37;

        System.out.println("\nMeasurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}
