package Programs;

import java.util.HashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mohammad";
		HashSet<Character> hm=new HashSet<Character>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(!hm.contains(c))
			{
				hm.add(c);
				sf.append(c);
			}
		}
		
		System.out.println(sf.toString());
	}

}
