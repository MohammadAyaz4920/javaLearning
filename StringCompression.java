package HashMapPrograms;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mohammad";
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.get(str.charAt(i))!=null)
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		StringBuffer sb=new StringBuffer();
		for(Entry<Character,Integer>entry:hm.entrySet())
		{
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());

	}

}
