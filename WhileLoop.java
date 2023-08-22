public class WhileLoop
{
    public static void main(String[] args)
    {
        int i =1 ;
    while (i <= 5)
    {
        System.out.println("THe Values In the loop Are = " + i );
        i++;
    }
    int j =1;
    boolean isReady =false;
    do
    {
        if (j > 5)
        {
            break;
        }
        System.out.println("value of j is " + j);
        j++;
        isReady = (j > 0);
    }
    while (isReady);

    int k = 0;
    while (k < 50)
    {
        k += 5;
        if (k % 25 == 0)
    {
        continue;
    }
        System.out.println("The Numbers are " + k);
    }
    }
}
