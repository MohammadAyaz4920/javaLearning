package ExceptionHandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			try
			{
				int a=10,b=0,c;
				c=a/b;
				System.out.println(c);				
			}
			catch(ArithmeticException a)
			{
				System.out.println("Inner try-catch block executed");
			}
			
			String str=null;
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println("Outer try-catch block executed");
		}

	}

}
