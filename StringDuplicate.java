package SetPrograms;

import java.util.LinkedHashSet;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My My name is is Ayaz Ayaz";		
		String[] arr=str.split(" ");
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			ls.add(arr[i]);
		}
		for(String Sentence:ls)
		{
			System.out.print(Sentence+" ");
		}
		System.out.println();

	}

}
