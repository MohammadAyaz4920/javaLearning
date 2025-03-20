package practice;

import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mohammad";
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		for(char ch:hm.keySet())
		{
			if(hm.get(ch)>1)
			{
				System.out.println(ch+" "+hm.get(ch));
			}
		}
		
	}

}
