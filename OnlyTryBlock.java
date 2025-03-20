package ExceptionHandling;

public class OnlyTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		
		finally
		{
			System.out.println("Finally Block Executed");
		}

	}

}
