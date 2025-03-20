package Programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of terms: ");
		int num=10;
		int first=0,second=1,next;
		System.out.println("The fibonacci series of numbers is:");
		for(int i=0;i<=num;i++)
		{
			System.out.println(first+"");
			next=first+second;
			first=second;
			second=next;
		}
		
	}

}
