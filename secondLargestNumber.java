package practice;

import java.util.Arrays;

public class secondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] { 2,4,68,38,99,75,34};
		Arrays.sort(arr);
		int size=arr.length;
		int secondLargest=arr[size-2];
		System.out.println(secondLargest);

	}

}
