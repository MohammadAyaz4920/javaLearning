package practice;

public class ReverseAlternateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Mohammad ayaz";
		StringBuilder sb=new StringBuilder();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i%2!=0)
			{
				sb.append(new StringBuilder(words[i]).reverse());
			}
			else
			{
				sb.append(words[i]);
			}
			if(i<words.length-1)
			{
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());

	}

}
