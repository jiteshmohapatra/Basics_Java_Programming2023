// To check whether the number is an Armstrong number or not.
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
	   try(Scanner scanner = new Scanner(System.in)){;
	   int n=scanner.nextInt();
           int result=0;
			//Use while loop check the number is Armstrong or not.
			//store the output(1 or 0) in result variable
		int remainder,temp,count=0,i;
		temp=n;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		i=count;
		temp=n;
		while(count>0)
		{
			remainder=temp%10;
			result += Math.pow(remainder, i);
			temp/=10;
			count--;
		}
		if(n==result)
			result=1;
		else
			result=0;

		System.out.print(result);
    }

	}
}
