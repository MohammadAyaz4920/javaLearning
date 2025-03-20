package Programs;

     class EmployeeDetails     //Define Class
     {
    	 int empNo;
    	 String empName;
    	 
    	 EmployeeDetails(int num, String Name)   //Define parameterized constructor
    	 {
    		 empNo=num;
    		 empName=Name;
    	 }
    	 EmployeeDetails(EmployeeDetails emp)    //Define copy constructor
    	 {
    		 empNo=emp.empNo;
    		 empName=emp.empName;
    	 }
    	 void display()							//Define method
    	 {
    		 System.out.println(empNo +" "+empName);
    	 }
     }

public class copyConstructor {					// Main Method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails e=new EmployeeDetails(10,"Ayaz");   //create object instance for parameterized constructor
		EmployeeDetails e2=new EmployeeDetails(e);			//create object instance for copy constructor
		e.display();
		e2.display();
		
	}

}
