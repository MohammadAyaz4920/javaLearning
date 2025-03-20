package Programs;

class AccDetails
{
	private int accno;
	private int bankBalance;
	public AccDetails(int accNo,int bankBalance)
	{
		this.accno=accNo;
		this.bankBalance=bankBalance;
		
	}
	public int getaccountNumber()
	{
		return accno;
	}
	public int getBalance()
	{
		return bankBalance;
	}
	
	public void deposit(int amount)
	{
		if(amount>0)
		{
			bankBalance+=amount;
			System.out.println("the bankbalance after deposited is: " +bankBalance);
		}
		else
		{
			System.out.println("Enter the valid amount");
		}
	}
	public void withdraw(int amount)
	{
		if(amount>0 && amount <=bankBalance)
		{
			bankBalance-=amount;
			System.out.println("the bankbalance after withdraw is: " +bankBalance);
		}
		else
		{
			System.out.println("Insufficient bank balance");
		}
	}
}

public class BankingApp {

	public static void main(String[] args) {
		
		AccDetails account=new AccDetails(1234,20000);
		account.deposit(1000);
		account.withdraw(5000);
	
	}

}
