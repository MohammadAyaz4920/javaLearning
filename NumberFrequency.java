package HashMapPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {1,2,3,1,2,4,5};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}

		for(Entry<Integer, Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
