package ExceptionHandling;

import java.io.IOException;

public class ThrowandThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		throw_throws("file.txt");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	static void throw_throws(String filename) throws IOException
	{
		if(filename==null)
		{
			throw new IllegalArgumentException("Illegal Argument Exception");
		}
		if(filename.equals("file.txt"))
		{
			throw new IOException("File Not found");
		}
		System.out.println("file name:"+filename);
				
	}

}
