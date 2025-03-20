package HashMapPrograms;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Ayaz");
		hm.put(102, "Nawaz");
		hm.put(99, "suhaill");
		
		TreeMap<Integer,String> ls=new TreeMap<Integer,String>(hm);
		System.out.println(ls);
		
		

	}

}
