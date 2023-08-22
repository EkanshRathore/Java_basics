public class EqualSumChecker
{
       public static boolean hasEqualSum(int value1,int value2,int value3)
       {
              if (value1 + value2==value3)
              {
                     System.out.println("The 2 values are equal to the 3rd value");
                     return true;
              }
              else
              {
                     System.out.println("The 2 values are not equal to the 3rd value");
                     return false;
              }
       }

       public static void main(String[] args)
       {
              hasEqualSum(2,2,4); //return true
              hasEqualSum(1,2,4); //return false
       }
}
