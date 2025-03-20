package Array_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {10,20,10,20,40,20};
		LinkedHashSet<Integer>hm=new LinkedHashSet<Integer>();
		for(int num:arr)
		{
			hm.add(num);
		}
		
		int[] convertedArray=new int[hm.size()];
		int i=0;
		
		for(int num: hm)
		{
		
			convertedArray[i++]=num;
		}
		
		System.out.println(Arrays.toString(convertedArray));
	}

}
