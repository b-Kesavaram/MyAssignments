package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] word = text.split(" ");
		Set<String> uniqueWords = new LinkedHashSet<String>();
		for (String eachWord : word) {
				/*if(uniqueWords.add(eachWord)==duplicateWords.add(eachWord)) {
				System.out.println(uniqueWords);
			}*/
					uniqueWords.add(eachWord);	
			}
		System.out.println(uniqueWords);
	}
}

