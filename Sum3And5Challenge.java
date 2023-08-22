public class Sum3And5Challenge
{
    public static void main(String[] args)
    {
        int divisibleBy = 0;
        int sumOf = 0;
    for (int i = 1 ; i <= 1000 ;i++ )
    {
        if ((i % 3 == 0 ) && (i % 5 == 0))
        {
            divisibleBy++;
            sumOf += i;
            System.out.println("Found a Match " + i);
        }
        if (divisibleBy == 5)
        {
            break;
        }
    }
        System.out.println("Sum = " + sumOf);
    }
}
