public class positiveNegativeZero
{
    public static void checkNumber(int number)
    {
        System.out.println("The Number provided to check is = " + number);
        if (number > 0)
        {
            System.out.println("The number given is positive");
        }
        else if (number < 0)
        {
            System.out.println("The number given is negative");
        }
        else
        {
            System.out.println("The number given is zero");
        }
        checkNumber(-2);
    }

    public static void main(String[] args)
    {
    checkNumber(-2);
    }
}
