package HashMapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(100,"Ayaz");
		hm.put(101,"Nawaz");
		hm.put(102, "Suhail");
		System.out.println(hm.size());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.get(101));
		hm.remove(100);
		System.out.println(hm.values());
		
		
		for(int i :hm.keySet())
		{
			System.out.println("The values of the hashmap are:"+hm.get(i));
		}
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		

	}

}
