public class MethodOverloadingChallenge
{
     public static double convertToCentimeters(int inches)
     {
         //double centimeter = inches/0.39370;
         //System.out.println("Height in Centimetres " + centimeter );
         return inches * 2.54;
     }
     public static double convertToCentimeters(int feet, int inches)
     {
         int feetToInches = feet*12;
         int totalInches = feetToInches + inches;
         double result = convertToCentimeters(totalInches);
         //System.out.println("Height in Centimeters by feet " + result);
         return result;
     }

    public static void main(String[] args)
    {
        System.out.println("Inches" +convertToCentimeters(68));
        System.out.println("5ft 8inches " + convertToCentimeters(5,8));
    }
}

