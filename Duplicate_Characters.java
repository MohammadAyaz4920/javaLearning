package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any English Statement");
		String str=scanner.nextLine();
		scanner.close();
		//convert String to charater Array
		char[] ca=str.toCharArray();
		//define Hashmap
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		//Iterate through character array using for loop
		
		for(char c : ca)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		for(char c:m.keySet())
		{
			if(m.get(c)>1)
			{
				System.out.println("Character "+c+" is repeated"+m.get(c)+" times");
			}
		}
		

	}

}
