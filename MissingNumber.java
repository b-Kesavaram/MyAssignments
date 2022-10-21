package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {7,8,4,1,6,9,2,5,10};
		int arraylength = data.length;
		System.out.println(arraylength);
		List<Integer> s = new ArrayList<Integer>();
		for (int i:data) {
			s.add(i);
		}
		Collections.sort(s);
		System.out.println(s);
		int number = s.size();
		for(int i=0;i<number;i++) {
			if (s.get(i)+1!=s.get(i+1)) {
				System.out.println(s.get(i)+1);
				
						}
		
		}

	}



	}


