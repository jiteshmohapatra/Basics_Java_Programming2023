// To find the largest among three numbers x, y, and z.

import java.util.Scanner;
public class assignment2 {
      
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){; 
        	int x = scanner.nextInt(); 
        	int y = scanner.nextInt();
		int z = scanner.nextInt();
		int result = 0;
		//Use if...else ladder to find the largest among 3 numbers and store the largest number in a variable called result.

		if( x > y && x > z)
		{
			result = x;
		}
		else if( y > x && y > z)
		{
			result = y;
		}
		else if( z > y && z > x)
		{
			result = z;
		}
		else
		{
			result = x;
		}

		System.out.print(result);
    }
	}

}