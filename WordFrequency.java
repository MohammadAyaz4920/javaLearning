package HashMapPrograms;

import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my my name is is ayaz ayaz";
		String[] arr=str.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String s : arr)
		{			
			hm.put(s, hm.getOrDefault(s, 0)+1) ;

	}
		System.out.println(hm);

}
}
