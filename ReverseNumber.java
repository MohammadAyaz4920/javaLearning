package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,digit,reverse;
		num=159;
		reverse=0;
		boolean flag=false;

while(num!=0) {
	
	digit=num%10;
	reverse=reverse*10+digit;
	num=num/10;
	}
System.out.println("reverse of a number:"+reverse);
	}

}
