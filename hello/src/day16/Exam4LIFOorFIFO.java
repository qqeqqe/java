package day16;

import java.util.*;

public class Exam4LIFOorFIFO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();   // LIFO 스타일 // 마지막에 넣은게 처음으로 나온다
				
		Queue q = new LinkedList(); // FIFO 스타일 // 처음으로 넣은게 처음으로 나온다
		//큐는 인터페이스 이다
		//인터페이스는 생성자를 만들수 없다
		//Queue 인터페이스를 구현한 (Linked List)클래스를 이용하여 인터페이스의 객체를 생성 할수 있다.
		
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=stack=");
		while (!st.isEmpty()){ // empty는 비었다라는 의미  // !empty는 비어있지 않는~!
			System.out.println(st.pop()); // pop 메소드는 추출
		}
		
		
		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll()); //poll 메소드는 추출
		}
	}

}
