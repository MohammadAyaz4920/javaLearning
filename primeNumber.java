package Programs;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		if(primeNum(number))
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		 sc.close();
	}

		// TODO Auto-generated method stub
public static boolean primeNum(int num){
	
		//int num=31;
		
		if(num<1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			return false;	
		}
	}
		return true;
}
}


