public class OperatorChallenge
{
    public static void main(String[] args)
    {
        double myFirstDouble=20.00d;
        System.out.println("My first variable is" + myFirstDouble);
        double mySecondDouble=80.00d;
        System.out.println("My second variable is" + mySecondDouble);
        double sum=((myFirstDouble + mySecondDouble) * 100.00d)+1;
        System.out.println("The sum of both the values is" +sum);
        double remainder= sum % 40.00d;
        System.out.println("The remainder of the sum and 40.00 is" + remainder);
        boolean myAnswer=true;
        if (remainder == 0.00)
        {
            System.out.println("The Value is true");
        }
        else
        {
            System.out.println("The Value got some remainder");
        }

    }
}
