package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ls=new ArrayList<Object>();
		ls.add("Ayaz");
		ls.add("Mohammad");
		ls.add("MTech");
		ls.add("Wipro");
		System.out.println(ls);
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		Object[] array=new Object[ls.size()];
		array=ls.toArray();
		for(Object ob:array)	
		{
			System.out.println(ob);
		}
	}

}
