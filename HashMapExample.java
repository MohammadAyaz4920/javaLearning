package Programs;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> Values=new HashMap<>();
		Values.put("name", "Ayaz");
		Values.put("Role", "Senior Project Engineer");
		Values.put("Company", "Wipro");
		
		System.out.println("employee name: "+Values.get("name"));
		System.out.println("employee Role: "+Values.get("Role"));
		System.out.println("employee Company: "+Values.get("Company"));
		System.out.println("the name key contains value? "+ Values.containsValue("Ayaz"));
		System.out.println("the name key contains value? "+ Values.containsKey("Company"));
		System.out.println("the name key contains value? "+ Values.containsKey("Companys"));
		
		//iterating through hashmap
		
		for(String key:Values.keySet())
		{
			System.out.println("key: "+key + " ,value: "+Values.get(key));
		}
		
	}

}
