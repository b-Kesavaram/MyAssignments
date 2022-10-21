package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
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
			for (int j=i+1;j<number;j++) {
				if(s.get(i)==s.get(j)) {
					System.out.println(s.get(i));
				}
				
			}
		}

	}

}
