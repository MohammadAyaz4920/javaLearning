package Programs;

public class SumExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]=new String[] {"ab23cd","bc67dj","jkd786lk"};
		int totalsum=0;
		for(String str:arr)
		{
			int sum=0;
			String num="";
			for(char ch: str.toCharArray())
			{
				if(Character.isDigit(ch))
				{
					num+=ch;
				}
				else if(!num.isEmpty())
				{
					sum+=Integer.parseInt(num);
					num="";
				}
			}
			
			 if(!num.isEmpty())
			{
				sum+=Integer.parseInt(num);
				
			}
			 totalsum+=sum;
		}
		System.out.println(totalsum);


	}

}
