package day16;

import java.util.*;
public class Exam5HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4"};
		//1은 string 1 , 인티저의1은 인티저의 1
		
		Set set = new HashSet(); // Set 은 인터페이스, 인터페이스는 객체를 생성 할수 없어 Hash클래스를 이용하여 객체를 생성
		
		for(int i=0; i <objArr.length; i++){
			set.add(objArr[i]); //중복을 혀용하지 않는다
		}
		System.out.println(set);
	}

	
	
	
}
