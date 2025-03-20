package Programs;

public class VowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mohammad";
		int vow=0;
		int con=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++)
		
		{
			Character ch=str.charAt(i);
			if(vowels.indexOf(ch)!=-1)
			{
				vow++;
			}
			else 
			{
				con++;
			}
		}
		
		System.out.println("no of vowels "+vow + "no of consonants "+con);

	}

}
