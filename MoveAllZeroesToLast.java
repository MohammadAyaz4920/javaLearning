package practice;

import java.util.Arrays;

public class MoveAllZeroesToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length)
		{
			arr[index]=0;
			index++;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
