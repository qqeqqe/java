package day16;

import java.util.*;

public class Exam6Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		
		for( ; set.size()<6 ; ){
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list); //정렬의 의미, 없어도 됨
		System.out.println(list);
		 
		}
	}

