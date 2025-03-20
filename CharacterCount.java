package Programs;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ayaz123%67mohammad";
		int letterCount=0, characterCount=0,specialCharCount=0;
		for(char ch: str.toCharArray())
		{
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			{
				letterCount++;
			}
			else if((ch>='0'&&ch<='9'))
			{
				characterCount++;
			}
			else
			{
				specialCharCount++;
			}
		}
		System.out.println(letterCount);
		System.out.println(characterCount);
		System.out.println(specialCharCount);

	}

}
