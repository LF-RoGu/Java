// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        int currentSpeed = 10;
        System.out.println("Velocity in Mph " + mphToKph(currentSpeed));
        System.out.println("Velocity in kph " + kphToMph(currentSpeed));
    }

    public static int mphToKph(double curentSpeed)
    {
        double toMilesPerHour = curentSpeed * 1.60934;
        return (int)toMilesPerHour;
    }
    public static int kphToMph(double currentSpeed)
    {
        double toKilometersPerHour = currentSpeed * 0.621371;
        return (int)toKilometersPerHour;
    }
}