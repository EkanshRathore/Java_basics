public class AreaCalculator
{
      public static double area(double radius)
      {
          if (radius < 0)
          {
              System.out.println("-1.0 ,represents invalid value");
          }
          double PI = Math.PI;
          double areaOFCircle = radius * radius * PI;
          System.out.println("The area OF circle is " + areaOFCircle);
          return radius;
      }
      public static double area(double x, double y)
      {
          if (x < 0 || y<0)
          {
              System.out.println("-1.0 Gives an Invalid Value");
          }
          double areaOfRectangle = x*y;
          System.out.println("The Area Of rectangle is "+ areaOfRectangle);
          return areaOfRectangle;
      }

    public static void main(String[] args)
    {
    area(5.0);
    area(-1);
    area(5.0,4.0);
    area(-1.0,4.0);
    }
}
