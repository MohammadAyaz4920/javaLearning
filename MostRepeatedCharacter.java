package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mohammad";
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		//System.out.println(hm);
		char repeated='\0';
		int maxcount=0;
		for(Entry<Character, Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>maxcount)
			{
				maxcount=entry.getValue();
				repeated=entry.getKey();
			}
		}
		System.out.println(repeated);
		

	}

}
