package Programs;

public class staticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticvar obj1=new staticvar();
		staticvar obj2=new staticvar();
		
		obj1.num=10;
		obj1.num2=20;		
		obj1.show();
		obj2.show();	

	}
}
	
	 class staticvar
	{
		static int num=100;
		int num2=200;
		void show() {		
		System.out.println(num);
		System.out.println(num2);
		}
	}


