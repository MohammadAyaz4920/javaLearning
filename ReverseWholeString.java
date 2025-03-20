package capgemini;

public class ReverseWholeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to Wipro";
		String rev="";
		String words[]=str.split(" ");
		for(int i=words.length-1;i>=0;i-- )
		{
			rev=rev+" "+words[i];
			
		}
		
		System.out.println(rev);
		

	}

}
