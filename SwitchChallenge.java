public class SwitchChallenge
{
     public static String Switchset(String variable)
     {
         switch (variable)
         {
             case "A" :
                 System.out.println("Able");
                 break;
             case "B" :
                 System.out.println("Baker");
                 break;
             case "C" :
                 System.out.println("Charlie");
                 break;
             case "D" :
                 System.out.println("Dog");
                 break;
             case "E" :
                 System.out.println("Easy");
                 break;
             default :
                 System.out.println("Not found");
         }
     return variable;
     }

    public static void main(String[] args)
    {
    Switchset("C");
    Switchset("G");
    Switchset("E");
    Switchset("A");
    }
}
