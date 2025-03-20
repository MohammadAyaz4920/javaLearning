package Array_Programs;

public class RotateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {10,20,30,40,50};
		int length=arr.length;
		int n=3;
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=arr[length-1];
			for(j=length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			
			arr[0]=last;
		}
		
		System.out.println("Array after rotation:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
