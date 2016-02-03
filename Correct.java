/* **************************************
*
* Program Name: Correct.java // Should match the format as the public class Correct except have .java at the end.
*
* Description: Sample test program
*
* Date: 08/31/2015
*
* Author: Emily McNeill
*
**************************************** */ // Missing the / part of 8/ to close the blocked comments.
public class Correct // Public should be public. Since I saved the file as Correct.java the public class changes from err to Correct a capital C is the correct format.
{
   public static void main(String[] args)// Public and MAIN should be public and main. string[] should be String[].
   {
         // Declare and initialize variables first. 
         int num1 = 9;
         int num2 = 3;// Missing a ;
         int sum;
         int difference;
         
         sum = num1 + num2; // Missing a ;
         difference = num1 - num2;// Instead of is it should be an = sign. Difference should be difference to match the instance varable.
         
         System.out.print("Total of numbers is " + sum);// Should be System.out.print instead of System.Out.Print.
         
         System.out.print("\n\n" + num1);// Should be System.out.print instead of System.Out.Println. /n/n should be "\n\n". Add + num1 as a conjunction.
         System.out.print(" - " + num2);// New System.out.print put in a - sign with spacing on both sides so it displays correctly. Add + num2 as a conjunction. 
         System.out.print(" = " + difference);// New System.out.print put in a = sign with spacing on both sides so it displays correctly. Add + difference as a conjunction.
   }// Missing the closing class brace.  
}// Missing the closing class brace.
 