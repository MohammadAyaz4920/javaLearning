package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr=new String[] {"ayaz","Mohammad","wipro"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		List<String> ls=new ArrayList<String>();
		ls=Arrays.asList(arr);
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}

	}

}
