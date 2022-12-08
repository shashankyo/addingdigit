package adddigit;

import java.util.Scanner;

public class Digsum {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to add:");
	int n = scan.nextInt();
	int sum =0;
	int d ;
	while(n !=0 )
	{
		d = n%10 ;
		
		sum = sum + d;
		
		n= n/10;
	}
	
	System.out.println("sum no is"+sum);
}

}

