package Programs;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String text=s.nextLine();
		int len=text.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(text.charAt(i)!=' ')
			{
		
			 count++;			
		}
	
	}
	       System.out.println("Total number of characters in a string: " + count);   
			
	}
}
