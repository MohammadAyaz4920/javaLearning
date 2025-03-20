package HashMapPrograms;

import java.util.HashMap;

public class StringFrequency_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcdabefef";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);

	}

}
