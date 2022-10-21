package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		int arraylength = data.length;
		System.out.println(arraylength);
		Set<Integer> s = new HashSet<Integer>();
		for (int i:data) {
			s.add(i);
		}
       
	   System.out.println(s);
       List<Integer> l = new ArrayList<Integer>(s);
	   Collections.reverse(l);
	   System.out.println(l.get(1));
	}

}
