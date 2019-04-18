package day16;

import java.util.*;


	
		class Exam2{
			public static void main(String[] args){
				ArrayList list1 = new ArrayList(10);  // arrayList의 크기가 정수10인 객체를 생성
				list1.add( new Integer(5));  //  익명 게시판을 이용해 정수 5의 객체를 생성
				list1.add( new Integer(4));
				list1.add( new Integer(2));
				list1.add( new Integer(0));
				list1.add( new Integer(1));
				list1.add( new Integer(3));
				//생성자 오버로딩을 사용 - 매개변수가 List인 경우
				
				
				ArrayList list2 = new ArrayList(list1.subList(1,4));  // list2 변수에 ( list1 변수의 배열 1~4까지)
				print(list1, list2); //배열 1부터 4까지 겹치는 부분 표시
				
				Collections.sort(list1); // sort 메서드를 이용해 정렬
				Collections.sort(list2); 
				print(list1, list2);
				
				System.out.println("------------------");
				System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
				//리스트 2가 리스트 1에 포함되어 있는지
				
				list2.add("B"); 
				list2.add("C");
				list2.add(3, "A");  // add 삽입할수 있는 기능 . 기존에 있던 값은 뒤로 밀린다.
				print(list1, list2);
				
				System.out.println("------------------");
				list2.set(3,  "AA"); //기존값에 덮어 쓰는 set 메소드
				print(list1, list2);
				
				
				// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
				//list1.retainAll(list2) // retainAll
				System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
				
				print(list1, list2);
				
				//0번지 부터 시작을 하면 remove()에 의 해 삭제가 되면 내용이 있는 번지가 변경이 되어
				//확인하지 않는 원소가 생길수 있기 때문에 거꾸로 작업해야 한다.
				for(int i= list2.size()-1 ; i >=0; i--){
					if(list1.contains(list2.get(i))) // list2에 있는 i원소값이 liast1에 포함되어있다면
						list2.remove(i);  // list2의 값을 지워라 (i)번지에 해당하는 
					}
				
				print(list1, list2);
				} //main 의 끝
			
			static void print(ArrayList list1, ArrayList list2){
				System.out.println("list1:" + list1);
				System.out.println("list2:" + list2);
				System.out.println();
			}		
}    //class

