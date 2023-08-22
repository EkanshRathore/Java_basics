public class IntEqualityPrinter
{
       public static void printEqual(int a,int b,int c)
       {
           if (a < 0 || b < 0 || c < 0)
           {
               System.out.println("Invalid Value");
           }
           else if (a == b && b==c && c==a)
           {
               System.out.println("The Values are Equal");
           }
           else if (a != b && b !=c && c !=a)
           {
               System.out.println("All The Values are Different");
           }
           else
           {
               System.out.println("Neither are equal or different");
           }
       }

    public static void main(String[] args)
    {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
}
