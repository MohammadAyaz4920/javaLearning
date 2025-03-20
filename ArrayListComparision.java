package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l1=new ArrayList(Arrays.asList(10,20,30,40,50));
		ArrayList l2=new ArrayList(Arrays.asList(20,10,30,40,60));
		
		Collections.sort(l1);
		Collections.sort(l2);
		Boolean eq=l1.equals(l2);
		System.out.println(eq);
		
		
		//System.out.println(l1.retainAll(l2));
		ArrayList l3=new ArrayList(l1);
		l3.retainAll(l2);
		System.out.println(l3);
		
		l3.removeAll(l2);
		System.out.println(l3);
		
		
	}

}
