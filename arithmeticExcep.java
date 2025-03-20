package ExceptionHandling;


import java.util.Scanner;

public class arithmeticExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int n=sc.nextInt();
		try
		{
			if(n==0)
			{
				throw new ArithmeticException("A number cant be divisible by 0");
			}
			double reciprocal=1.0/n;
			System.out.println(reciprocal);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
