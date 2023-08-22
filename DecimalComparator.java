public class DecimalComparator
{
     public static boolean areEqualByThreeDecimalPlaces(double value1,double value2)
     {
          if ((int)(value1 * 1000) ==(int) (value2*1000))
          {
               System.out.println("The Equations are equal");
               return true;
          }
          else
          {
               System.out.println("The Equations are not equal ");
               return false;
          }
     }

     public static void main(String[] args)
     {
          areEqualByThreeDecimalPlaces(3.134,3.1346);
     }
}
