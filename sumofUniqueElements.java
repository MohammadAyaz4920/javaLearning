package practice;

import java.util.HashMap;
import java.util.HashSet;

public class sumofUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,1,5,5,6,7,7,8,9};
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int sum=0;
		for(int num: arr)
		{
			hm.put(num,hm.getOrDefault(num, 0)+1);
		}
		for(int num:arr)
		{
			if(hm.get(num)==1)
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
