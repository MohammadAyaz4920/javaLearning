package practice;

import java.util.Arrays;

public class MoveEvenNumbersToLast {

	public static void main(String[] args) {
		
		int[] arr = {12, 3, 5, 8, 7, 10, 9, 4, 1, 6};
		
			
		int[] temp=new int[arr.length];
		
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
			    temp[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			    temp[index]=arr[i];
				index++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}


