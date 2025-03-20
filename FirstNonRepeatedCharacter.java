package practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mohammad";
		LinkedHashMap<Character,Integer>hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		//System.out.println(hm);
		char nonrepeated='\0';
		for(Entry<Character, Integer> entry:hm.entrySet())
		{
			if(entry.getValue()==1)
			{
			nonrepeated=entry.getKey();
			break;
			}
		}
	
	if(nonrepeated!='\0')
	{
		System.out.println("The first non-repeated character is:"+nonrepeated);
	}
	else
	{
		System.out.println("There is no repeated character");
	}

}
}
