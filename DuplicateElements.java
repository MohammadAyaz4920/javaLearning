package Array_Programs;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {4,6,7,8,8,9,9,10,11,12,13,12,14,11};
		for(int i=0;i<arr.length;i++)
		{
			for(int j= i+1 ;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Elements:"+arr[i]);
				}
			}
		}
	}

}
