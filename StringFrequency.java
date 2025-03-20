package HashMapPrograms;

import java.util.HashMap;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Mohammmad Ayaz";
	    str=str.toLowerCase();				
			HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
			for(int i=0;i<str.length();i++)
			{
				Character ch=str.charAt(i);
				hm.put(ch, hm.getOrDefault(ch, 0)+1);				
			}
			System.out.println(hm);
			
		

	}

}
