//To find the perimeter and area of a circle given a value of radius.

import java.util.Scanner;  
public class assignment1 {
       public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in)){
       double radius= 25;
       double perimeter;
       double area;

//Calculate the perimeter 

	perimeter = 2 * Math.PI * radius;
//Calculate the area
	area = perimeter * radius;
	
	System.out.println(perimeter);
	System.out.println(area);
}
	}
}