public class TeenNumberChecker
{
       public static boolean hasTeen(int val1,int val2,int val3)
       {
              if ((val1 >=13 && val1 <=19)||(val2 >=13 && val2 <=19)||(val3 >=13 && val3 <=19))
              {
                     System.out.println("True");
                     return true;
              }
              else
              {
                     System.out.println("False");
                     return false;
              }
       }
       public static boolean isTeen(int value1)
       {
              if (value1 >=13 && value1 <=19)
              {
                     System.out.println("True");
                     return true;
              }
              else
              {
                     System.out.println("False");
                     return false;

              }
       }

       public static void main(String[] args)
       {
              hasTeen(12,23,18); //return true
              hasTeen(12,24,28); //return false
              isTeen(15); //return true
              isTeen(45); //return false
       }
}
