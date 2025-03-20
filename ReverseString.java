package capgemini;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I will move forward always";
		String words[]=str.split(" ");
		String rev="";
		char ch[]=words[3].toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		words[3]=rev;
		String output=String.join(" ", words);
		System.out.println(output);
	}

}
