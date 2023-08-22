public class SecondsAndMinutesChallenge
{
       public static String getDurationString(int seconds)
       {
           if (seconds <= 0)
           {
               System.out.println("The System printS an Invalid Value " +seconds);
           }
           int minutes = seconds / 60;
           int hours = minutes / 60;
           int remainingMinutes = minutes %60;
           int remainingSeconds = seconds %60;
           System.out.println(hours + " h " + remainingMinutes + " m " + remainingSeconds + " s ");

           return "";
       }
       public static String getDurationString(int minutes, int seconds)
       {
           if (minutes <=59)
           {
               System.out.println("Invalid Value " + seconds +" The value should be positive " +  minutes);
           }
           int hours = minutes / 60;
           int remainingMinutes = minutes %60;
           int remainingSeconds = seconds %60;
           System.out.println(hours + " h " + remainingMinutes + " m " + remainingSeconds + " s ");
           return "";

       }

    public static void main(String[] args)
    {
    getDurationString(-3945);
    getDurationString(-65,145);
    }
}
