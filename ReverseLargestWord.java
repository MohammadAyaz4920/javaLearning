package practice;

public class ReverseLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My Name is Cristiano Ronaldo";
		StringBuilder sb=new StringBuilder();
		String[] words=str.split(" ");
		int maxLength=0;
		int LargestIndexNum=-1;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>maxLength)
			{
				maxLength=words[i].length();
				LargestIndexNum=i;
				
			}
		}
		
		if(LargestIndexNum!=-1)
		{
			words[LargestIndexNum]=new StringBuilder(words[LargestIndexNum]).reverse().toString();
		}
		
		System.out.println(String.join(" ", words));
				

	}

}
