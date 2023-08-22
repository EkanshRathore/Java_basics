public class ForLoop {

    public static double calculateInterest(double amount, double rate)
    {
        double interest = (amount * (rate / 100));
        //System.out.println("The Interest is " + interest);
        return interest ;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(" Integer " + i);
        }
        for (double rate = 1 ; rate <= 5.0; rate ++)
        {
            double interest1 =calculateInterest(10000.0,rate);
            System.out.println("Amount 10000 at " +rate + " % interest = " + interest1);
        }
        for (double i =7.5 ; i <= 10;i +=0.25)
        {
            double interestDollar = calculateInterest(100.00,i);
            if (interestDollar > 8.5)
            {
                break;
            }
            System.out.println("Amount 100.00 dollars at " + i + " % Interest = " + interestDollar + "$");
        }
    }
}
