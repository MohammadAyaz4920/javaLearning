package capgemini;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {70,110,50,60,30,20,90};
		
		int firstLargest=arr[0];
		int secondLargest=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else if(arr[i]>secondLargest&&arr[i]!=firstLargest)
			{
				secondLargest=arr[i];
			}
		}
		
		System.out.println(secondLargest);

	}

}
