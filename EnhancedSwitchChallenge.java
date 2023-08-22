public class EnhancedSwitchChallenge
{
     public static void printDayOfWeek(int day)
     {
         switch (day)
         {
             case 0 -> System.out.println("Sunday");
             case 1 -> System.out.println("Monday");
             case 2 -> System.out.println("Tuesday");
             case 3 -> System.out.println("Wednesday");
             case 4 -> System.out.println("Thursday");
             case 5 -> System.out.println("Friday");
             case 6 -> System.out.println("Saturday");

             default -> System.out.println("Invalid Day");
         }
     }
     public static void printWeekDay(int day)
     {
         if (day==0)
         {
             System.out.println("Sunday");
         }
         else if (day==1)
         {
             System.out.println("Monday");
         }
         else if (day==2)
         {
             System.out.println("Tuesday");
         }
         else if (day==3)
         {
             System.out.println("Wednesday");
         }
         else if (day==4)
         {
             System.out.println("Thursday");
         }
         else if (day==5)
         {
             System.out.println("Friday");
         }
         else if (day==6)
         {
             System.out.println("Saturday");
         }
         else
         {
             System.out.println("Invalid day");
         }
     }


    public static void main(String[] args)
    {
    printDayOfWeek(0); // should return sunday
    printDayOfWeek(3); // Should return wednesday
    printDayOfWeek(6); // Should return Saturday
    printDayOfWeek(8); // Should return invalid value
    printWeekDay(1); //should return monday
    printWeekDay(4);// should return Thursday
    printWeekDay(2);//should return Tuesday
    printWeekDay(7);// should return Invalid Day
    }
}

