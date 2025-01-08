import java.util.*;
 public class ConvertKilometersToMiles{
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter in kilometers");
	 float kilometers = sc.nextFloat();
	 float miles = (float)(kilometers*0.621371);
	  System.out.println("kilometers in miles is: " + miles);
	  }
	  }