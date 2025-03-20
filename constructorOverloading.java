package Programs;


	class cricket
	{
		int position;
		String playerName;
		double runs;
		cricket()
		{
			position=1;
			playerName="Kohli";
			runs=45.23;			
		}
		
		cricket(int x)
		{
			position=x;
		}
		
		cricket(int x, String y)
		{
			position=x;
			playerName=y;
		}
		
		cricket(int x, String y, double z)
		{
			position=x;
			playerName=y;
			runs=z;
		}
		
	}
	
	public class constructorOverloading {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cricket c=new cricket();
		cricket c2=new cricket(3);
		cricket c3=new cricket(4,"Dhoni");
		cricket c4=new cricket(5,"ABD",175);
		
		System.out.println(c.position +" "+c.playerName+" "+c.runs);
		System.out.println(c2.position);
		System.out.println(c3.position +" "+c3.playerName);
		System.out.println(c4.position +" "+c4.playerName+" "+c4.runs);
		

	}

}
