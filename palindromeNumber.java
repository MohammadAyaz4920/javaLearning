package practice;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=141,rev=0,digit;
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		System.out.println(rev);

	
	
	if(num==rev)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}

}
}
