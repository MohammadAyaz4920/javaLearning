package Programs;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		scanner.close();
		int sum=0;
		while(number!=0)
		{
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;
			
		}
		System.out.println("The sum of the digits of the number is :" +sum);
		
			
		
		
	}

}
