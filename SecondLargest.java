package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num=new Integer[] {10,20,50,60,90,200,190,220};
		List<Integer> ls=Arrays.asList(num);
	
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println("The second largest element in the array is:"+ls.get(ls.size()-2));

	}

}
