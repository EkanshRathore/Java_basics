public class IfElse
{
    public static void main(String[] args)
    {
    boolean GameOver = true;
    int score = 10000;
    int levelcompleted = 8;
    int bonus = 200;
    int finalscore = score;
        {
            if(GameOver == true)
            {
                finalscore += (levelcompleted * bonus);
                System.out.println("The final Scores are =" + finalscore);
            }
        }


    if(score < 5000 && score > 1000)
    {
        System.out.println("Your Score is less than 5000 and greater than 1000");
    }
    else if (score < 1000)
    {
        System.out.println("Your Score is greater than 1000");
    }
    else
    {
        System.out.println("The Score is not more than 5000");
    }

    }
}
