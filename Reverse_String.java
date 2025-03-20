package Programs;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	String str=sc.nextLine();
	String rev="";
	char[] ch=str.toCharArray();
	int size=ch.length;
	for(int i=size-1;i>=0;i--)
	{
		rev=rev+ch[i];
	}
		
System.out.println(rev);
	}

}
