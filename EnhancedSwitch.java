public class EnhancedSwitch
{
    public static String getQuarter(String month)
    {
        switch (month)
        {
            case "January", "February", "March" -> System.out.println("1st quarter");
            case "April", "May", "June" -> System.out.println("2nd Quarter");
            case "July", "August", "September" -> System.out.println("3rd Quarter");
            case "October", "November", "December" -> System.out.println("4th Quarter");

            default -> System.out.println("BadResponse");
        }
        return month;

    }

    public static void main(String[] args)
    {
    getQuarter("November"); //should return 4th quarter
    getQuarter("April"); //should return 2nd Quarter
    getQuarter("January"); // should return 1st Quarter
    getQuarter("August"); // should return 3rd Quarter
    getQuarter("Nothing"); // should go to default
    }
}
