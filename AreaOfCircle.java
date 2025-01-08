import java.util.*;
   public class AreaOfCircle{
     public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
           System.out.println("Enter radius");
	   float radius = sc.nextFloat();
	   float areaOfCircle = (float)(3.14*radius*radius);
	   System.out.println("area is :  = " + areaOfCircle);
	 }
    }