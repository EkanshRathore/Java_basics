public class Method
{
    public static void Calculate(boolean gameOver, int score, int levelCompleted, int bonus )
    {
        int finalScore = score;
        if (gameOver == false)
        {
            finalScore += (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("The Final Score is =" +finalScore);
        }
    }

    public static void main(String[] args)
    {
        Calculate(true,7000,7,400);
        Calculate(false,2800,4,600);
    }
}

