import java.util.*;
 public class CalculateSimpleInterest{
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter principal");
	 double principal = sc.nextDouble();
	 System.out.println("Enter rate");
	 double rate = sc.nextDouble();
          System.out.println("Enter time");
	 int time = sc.nextInt();
	 double Interest = (principal*rate*time)/100;
	  System.out.println("Simple Intrest is: " + Interest);
	  }
	  }