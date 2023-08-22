public class Switch
{
    public static void main(String[] args)
    {
        int switchValue = 5;
        switch (switchValue)
        {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:case 4:case 5:
            System.out.println("The value could be 3 ,4 ,5");
            System.out.println("But thhe value actually is " + switchValue);
            break;
            default:
                System.out.println("It was neither 1,2,3,4, or 5");
                break;
        }
    }
}
