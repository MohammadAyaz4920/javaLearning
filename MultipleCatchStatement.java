package ExceptionHandling;

public class MultipleCatchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
//		int a=10,b=0,c;
//		c=a/b;
//		System.out.println(c);
			String str=null;
			System.out.println(str.toUpperCase());
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException n)
		{
			System.out.println("Null Pointer Exception");
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("Array Index Out of Bounds Exception");
		}
		finally
		{
			System.out.println("Finally Block Executed");
		}

	}

}
