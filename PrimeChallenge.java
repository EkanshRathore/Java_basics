public class PrimeChallenge {
    public static boolean isPrime(int Number) {
        if (Number <= 2)
        {
            return (Number == 2);
        }

        for (int divisor = 2; divisor <= Number / 2; divisor++)
        {
            if (Number % divisor == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int count = 0;


        for (int i = 1; i <= 50; i++)
        {
            if (isPrime(i))

            {
                System.out.println("The number " + i + " is a Prime Number");
                count++;
            }

        }
    }
}