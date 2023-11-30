
import java.util.Scanner;
public class p2{
public static void main(String args[]){

try(Scanner scanner = new Scanner(System.in)){
double radius = 25;
double perimeter;
double area;
double dia;
//calculate the perimeter

perimeter = 2 * Math.PI * radius;

// calculate the area

area = Math.PI * radius * radius;


//calculate the diameter

dia = 2 * radius;

System.out.println("The  perimeter of the circle is " + perimeter);
System.out.println("The  area of the circle is " + area);
System.out.println("The  Diameter of the circle is " + dia);
}



}







}