package Programs;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values: ");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 System.out.println("a and b values before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a and b values after swapping: "+a+" "+b);
		
		
		
	}

}
