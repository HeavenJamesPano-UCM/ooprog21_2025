class DebugCircle // I removed public so the code works in older java versions.
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }
   public int getRadius()// I deleted the extra semicolon in 'getRadius()' method.
   {
      return radius; // I fixed the spelling mistake 'radiuss' to 'radius'.
   }
   public int getDiameter() // I changed void to int in getDiameter() so it can return a number.
   {
      return diameter;
   }
   public double getArea()
   {
      return area;
   }
}