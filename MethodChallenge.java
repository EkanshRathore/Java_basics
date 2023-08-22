public class MethodChallenge
{
    public static void displayHighScorePosition(String playerName,int highScorePosition)
    {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the High Score list");
    }
    public static int calculateHighScorePosition(int highScorePosition)
    {
        if (highScorePosition >= 1000)
        {
            System.out.println("The result is 1 in the highscore list");
            return 1;
        }
        else if (highScorePosition >= 500 && highScorePosition <1000)
        {
            System.out.println("The result is 2 in the highscore list");
            return 2;
        }
        else if (highScorePosition >=100 && highScorePosition <500 )
        {
            System.out.println("The result is 3 in the highscore list");
            return 3;
        }
        else
        {
            System.out.println("The result is 4 in the highscore list");
            return 4;
        }
    }

    public static void main(String[] args)
    {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ekansh",highScorePosition);
        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Shubham",highScorePosition);
        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Adii",highScorePosition);
        highScorePosition = calculateHighScorePosition(10);
        displayHighScorePosition("Vinay",highScorePosition);
        highScorePosition = calculateHighScorePosition(-100);
        displayHighScorePosition("Lakshya",highScorePosition);
    }

}
