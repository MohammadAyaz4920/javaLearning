package Programs;

import java.util.Scanner;

public class String_Reverse_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		String ReverseString = "";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			ReverseString+=str.charAt(i);
		}
		
System.out.println("string after reverse: "+ReverseString);
	}

}
