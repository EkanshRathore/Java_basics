public class KeywordsAndExpressions
{
    public static void main(String[] args)
    {
        double kilometer = (50 * 1.607894);
        int highScore = 50;
         if (highScore > 25)
         {
              highScore =1000 +highScore; //add bonus points
             System.out.println("the highscore is =" + highScore);
         }
         int health=100;
         if((health < 50) && (highScore > 1000))
         {
             highScore = highScore-1000;
         }
    }

}
