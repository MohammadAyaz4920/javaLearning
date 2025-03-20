package Programs;

import java.util.HashSet;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,4,6,9,2};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num: a)
		{
			set.add(num);
		}
		int n=a.length+4;
		for(int i=1;i<n;i++)
		{
			if(!set.contains(i))
			{
				System.out.println(i);
			}
		}
				

	}

}
