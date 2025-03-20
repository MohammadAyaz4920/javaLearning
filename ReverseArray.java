package Array_Programs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse of an array: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println(arr[i]);
		}

	}

}
