package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListDuplicateElements {

	public static void main(String[] args) {
	
		ArrayList lm=new ArrayList();
		lm.add(1);
		lm.add(2);
		lm.add(1);
		lm.add(4);
		//LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>(lm);
		HashSet<Integer>ls=new HashSet<Integer>(lm);
		ArrayList withoutDuplicateElements=new ArrayList(ls);
		System.out.println("Arraylist without duplicate Elements:"+withoutDuplicateElements);
		

	}

}
