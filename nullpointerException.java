package ExceptionHandling;

public class nullpointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] arr=new String[5];
//		
//		System.out.println(arr[1].length());
		
		try {
		
		String s=null;
		System.out.println(s.toUpperCase());
		
		}
		
		catch(NullPointerException n)
		{
			System.out.println("the string cant be null");
		}

	}

}
