package Array_Programs;

public class searchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {10,20,30,60,90};
		int index=-1;
		int num=90;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				index=i;
				break;
			}
		}
		
		if(index!=-1)
		{
			System.out.println("the number is found at index: "+index);
		}
		else
		{
			System.out.println("The number is not found");
		}
				

	}

}
