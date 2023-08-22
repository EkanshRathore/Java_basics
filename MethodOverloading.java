public class MethodOverloading
{
    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName +" Scores "+ score + " points ") ;
        return score*1000;
    }
    public static int calculateScore(int score)
    {
        System.out.println("Player Anonymous Scores "+ score + " points ") ;
        return score*1000;
    }
    public static int calculateScore()
    {
        System.out.println("Player 0 Scores points ") ;
        return 0;
    }

    public static void main(String[] args)
    {
    int newScore = calculateScore("Ekansh" , 55);
        System.out.println("New Score is " +newScore);
        calculateScore(78);
        calculateScore();
        System.out.println("New score" + calculateScore("Devansh",45));
        System.out.println("The New Score " + calculateScore(25));

    }
}
