public class SumOddRange
{
      public static boolean isOdd(int number)
      {
          if ((number > 0) && (number % 2 != 0))
          {
              return true;
          }
          else
          {
              return false;
          }
      }
      public static int sumOdd(int start,int end)
      {
          int sumOf = 0;
          if (start > 0 && end >0 && end >= start)
          {
              for (int i = 1; i <= end; i++)
              {
                  if (isOdd(i))
                  {
                      sumOf =sumOf+i;
                  }
              }
              return sumOf;
          }
          else
          {
              return -1;
          }

      }

    public static void main(String[] args)
    {
        System.out.println("The sum is = " + sumOdd(1, 100));
        System.out.println("The sum is = " + sumOdd(-1, 100));
        System.out.println("The sum is = " + sumOdd(100, 100));
        System.out.println("The sum is = " + sumOdd(13, 13));
        System.out.println("The sum is = " + sumOdd(100, -100));
        System.out.println("The sum is = " + sumOdd(100, 1000));
    }
}
