import java.text.DecimalFormat;
/**
 * @author Natasya Virgichalia.
 * Date: 09/03/2017.
 * CSC 201.
 * Professor Tanes Kanchanawanchai.
 * Assignment 1.
 * Problem 1.10.
 * This program converts a runner's average speed
 * from kilometers in minutes and seconds to miles per hour.
 */
public class averageSpeed {
    public static void main(String[]args) {
        //initialize variables
        double km = 14;
        double min = 45;
        double sec = 30;
        double aveSpeed;
        //convert minutes and seconds to hours
        double toHours = (min/60) + (sec/3600);
        //calls milesPerHour method
        aveSpeed = milesPerHour(km, toHours);
        DecimalFormat decimal = new DecimalFormat("#.000");
        System.out.println("The average speed is " + decimal.format(aveSpeed) + " miles per hour.");
    }
    /**
     * This method converts kilometers to miles and
     * it uses the formula to find miles per hours with the kilometers and hours given.
     * @param kilometers
     * @param toHours
     * @return average speed in miles perhour.
     */
    public static double milesPerHour (double kilometers, double toHours) {
        double toMiles = (kilometers/1.6);
        double toMilesPerHour = toMiles/toHours;
        return toMilesPerHour;
    }
}
