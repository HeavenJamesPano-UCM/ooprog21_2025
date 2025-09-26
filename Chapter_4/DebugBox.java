 class DebugBox // I removed public so the code works in older Java versions.
{
   private int width;
   private int length;
   private int height;
   
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length; // i changed from width to length
      this.height = height; // i changed from width to height
   }
   public void showData()
   {
      System.out.println("Width: "  + width + "  Length: " +
        length + "  Height: " + height);
   }
   public double getVolume()
   { 
      double vol = length * width * height;
      return vol;
   }
}