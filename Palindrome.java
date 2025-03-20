package Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.nextLine();
		str=str.toLowerCase();
		boolean flag=true;
		for(int i=0;i<=str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=false;
				break;
			}
			
		}
		
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
}
	
}
