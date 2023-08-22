public class NumberOfDaysInMonth
{
        public static boolean isLeapYear(int year)
        {
            if (year >= 1 || year <= 9999)
            {
                System.out.println((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999));
                return true;
            }
            else
            {
                return false;
            }
        }
        public static int getDaysInMonth(int month,int year)
        {
            if (month < 1 && month > 12 || year < 1 && year > 9999)
            {
                return -1;
            }
            int noOfDays=0;
            switch (month)
            {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("These Months contains 31 days");
                case 2 ->
                {
                if (isLeapYear(year))
                {
                    System.out.println("This Month Contain 29 Days");
                }
                    System.out.println("This Month contains 28 Days");
                }
                case 4,6,9,11 -> System.out.println("These Months Contains 30 Days");
                default -> System.out.println("Invalid Value");
            }
            return noOfDays;
        }


        public static void main(String[] args)
        {
            isLeapYear(-1600);
            isLeapYear(1600);
            isLeapYear(2017);
            isLeapYear(2000);
            getDaysInMonth(1, 2020);
            getDaysInMonth(2, 2020);
            getDaysInMonth(2, 2018);
            getDaysInMonth(-1, 2020);
            getDaysInMonth(1, -2020);
        }
}

