package Programs;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ayaz"; //output should be "yz"
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		StringBuilder sb=new StringBuilder();
		for(char ch:str.toCharArray())
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		for(char ch:str.toCharArray())
		{
			if(hm.get(ch)==1)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
		
	}

}


