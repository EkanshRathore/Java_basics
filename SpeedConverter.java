public class SpeedConverter
{
    public static long toMilesPerHour(double kilometersPerHour)

    {
        if (kilometersPerHour < 0)
        {
            //System.out.println("Gives an invalid number");
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            System.out.println("Invalid number");
        }
        else
        {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h " + milesPerHour + " mi/h ");
        }
    }

    public static void main(String[] args)
    {
    toMilesPerHour(6.7);
    printConversion(19.8);

    }
}
