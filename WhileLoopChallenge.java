public class WhileLoopChallenge
{
      public static boolean isEvenNumber(int num)
      {
          if ((num % 2) == 0)
          {
              return true;
          }
          else
          {
              return false;
          }
      }

    public static void main(String[] args)
    {
        int i = 4;
        int finalNum = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (i <= finalNum)
        {
            i++;
            if (!isEvenNumber(i))
            {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + i);
            evenCount++;
            if (evenCount >= 5)
            {
                break;
            }

            System.out.println("The odd numbers are = " + oddCount);
            System.out.println("The even numbers are = " + evenCount);
        }
    }
}
