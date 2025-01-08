import java.util.*;
 public class CalculateAverageOfThreeNumbers{
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter first");
	 float first = sc.nextFloat();
	 System.out.println("Enter second");
	 float second = sc.nextFloat();
	 System.out.println("Enter third");
	 float third = sc.nextFloat();
	 float average = (float)((first+second+third)/3);
	  System.out.println("Average of three number is: " + average);
	  }
	  }