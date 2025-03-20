package Array_Programs;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1=new int[][] {{1,3,4},{2,3,4},{3,4,5}};
		int[][] arr2=new int[][] {{1,3,4},{2,3,4},{3,4,5}};
		
		int[][] arr3=new int[3][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr3[i][j]=arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
