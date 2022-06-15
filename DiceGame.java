// Name:- Shivam Sharma
// Student Id:- A00253431
// Program Description:- DiceGame.java program creates different sized dice objects using each constructor from the Die class.

package DiceLab;

public class DiceGame 
{
   public static void main(String[] args) 
   {
       System.out.println("Creating a default d6...");
       Die d6 = new Die();
       System.out.println("Creating a default d20...");
       Die d20 = new Die(20);
       System.out.println("Creating percentile die (a special d10)...");
       Die d10 = new Die(10);
       System.out.println("The current side up for " + d6.getName() + " is " + d6.getCurrSideUp());
       System.out.println("The current side up for " + d20.getName() + " is " + d20.getCurrSideUp());
       System.out.println("The current side up for Percentile  is " + d10.getCurrSideUp());
       
       System.out.println("\nTesting the roll method");
       System.out.println("Rolling the d6...");
       d6.rollCounts();
       System.out.println("The new value is " + d6.getCurrSideUp());
       System.out.println("Rolling the d20...");
       d20.rollCounts();
       System.out.println("The new value is " + d20.getCurrSideUp());

       System.out.println("Rolling the Percentile...");
       d10.rollCounts();
       System.out.println("The new value is " + d10.getCurrSideUp());

       System.out.println("\nSetting the d20 to show 20...");
       d20.setSideUp(20);
       System.out.println("The side up is now " + d20.getCurrSideUp() + ". Finally.");

       System.out.println("- - - -");
       System.out.println("BONUS");
       System.out.println("- - - -");

       Die[] dices = new Die[5];

       System.out.println("Creating 5 d6");
       
       for (int i = 0; i < dices.length; i++) dices[i] = new Die(6);
       int totalRolls = 0;
       do 
       {
           for (int i = 0; i < dices.length; i++) dices[i].rollCounts();
           totalRolls += 1;
       } 
       while (dices[0].getCurrSideUp() != dices[1].getCurrSideUp() ||
               dices[0].getCurrSideUp() != dices[2].getCurrSideUp() ||
               dices[0].getCurrSideUp() != dices[3].getCurrSideUp() ||
               dices[0].getCurrSideUp() != dices[4].getCurrSideUp()
       );
       System.out.println("YAHTZEE! It took " + totalRolls + " rolls");
   }
}