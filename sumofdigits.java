package practice;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1599,digit,sum;
		sum=0;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
