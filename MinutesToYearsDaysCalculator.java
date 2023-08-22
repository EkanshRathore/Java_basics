public class MinutesToYearsDaysCalculator
{
        public static void printYearsAndDays(long minutes)
        {
            if (minutes <0)
            {
                System.out.println("Invalid Value");
            }
            long hour = minutes / 60;
            long days = minutes /1440;
            long years = minutes /525600;
            long remainingdays = days /365;
            System.out.println(minutes + "min =" + years + "Years" + remainingdays +"Days" );
        }

    public static void main(String[] args)
    {
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
    }
}
