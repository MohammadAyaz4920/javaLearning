package Array_Programs;

public class ArrayMissing {
	
public static void main(String[] args)
{
	
	int[] arr=new int[] {1,2,4,5};
	int n=arr.length+1;
	int expectedSum=n*(n+1)/2;
	int actualSum=0;
	
	for(int sum : arr)
	{
		actualSum+=sum;
	}
	int missingElement=expectedSum-actualSum;
	System.out.println("The Missing element is: "+missingElement);
}
}
