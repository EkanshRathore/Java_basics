public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("HelloWorld");
        {
            boolean isAlien = true;
            if (isAlien == true) {
                System.out.println("Aliens are real");
            }
        }
        {
            int topScore = 80;
            if (topScore < 100) {
                System.out.println("You got the high score!");
            }

            int secondTopScore = 70;
            if (topScore > secondTopScore && topScore < 100) {
                System.out.println("Greater than second top score and less than 100");
            }
            {
                if(topScore>90 || secondTopScore <=90)
                {
                    System.out.println("Either one of them is only true");
                }
                {
                    int newValue=100;
                    if (newValue == 100)
                    {
                        System.out.println("The value is correct and doesnt have any errors");
                    }
                    int ageOfClient=17;
                    String ageText=ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
                    {
                        System.out.println("Our Client is " + ageOfClient);
                    }
                }
            }
        }
    }
}

