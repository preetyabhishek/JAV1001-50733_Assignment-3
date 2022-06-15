package DiceLab;

public class Die
{
   private String nameStr;
   private int totalSides;
   private int curSideUp;

   public Die() 
   {
	   nameStr = "d6";
	   totalSides = 6;
	   rollCounts();
   }

   public Die(int totalSides)
   {
       this.totalSides = totalSides;
       nameStr = "d" + totalSides;
       rollCounts();
   }

   public Die(int totalSides, int curSideUp) 
   {
       this.totalSides = totalSides;
       nameStr = "d" + totalSides;
       this.curSideUp = curSideUp;
   }

   //A roll method to generate a random value
   public void rollCounts() 
   {
	   curSideUp = (int) (1 + Math.random() * totalSides);
   }

   public String getName() 
   {
       return nameStr;
   }

   public int getAllSides() 
   {
       return totalSides;
   }

   public int getCurrSideUp() 
   {
       return curSideUp;
   }

   public void setSides(int totalSides) 
   {
       this.totalSides = totalSides;
       nameStr = "d6";
   }

   public void setSideUp(int curSideUp) 
   {
       this.curSideUp = curSideUp;
   }
}