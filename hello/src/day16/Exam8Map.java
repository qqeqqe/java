package day16;

import java.util.*;

public class Exam8Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap(); // 해싱
		map.put("myId", "1234");  //공식 앞에 있는게 key 뒤에 있는데 value 
		map.put("asdf", "1111");
		//key값이 중복되면 valus를 어떻게 처리할 것인가
		//key값이 중복되면 value값을 
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		
		
		
		while(true){ //조건문이 참이면 아래 실행문을 실행하시오
			System.out.println("ID와 PASSWORD를 입력해 주세요"); 
			
			System.out.println("id : ");
			String id = s.nextLine().trim(); // 스캐너를 입력받은 내용 // 뒤에 트림은 공간 삭제
			
			
			System.out.println("PASSWORD : ");
			String password = s.nextLine().trim();//트림은 공백 제거 메소드
			
			System.out.println();
			
			if(!map.containsKey(id)){ //컨테인은 포함하다 
			// 첫번재 입력 받은 스캐너의 내용을 id(key)에 포함했는데 그 값이 map와 있지 않다면
				
				System.out.println("입력하신 id는 존재하지 않습니다" + "다시 입력해주세요");

				
			}else{
				if(!(map.get(id)).equals(password)){ 
				//입력받은 비밀번호와 id의 비밀번호가 같지 않다면~
					
					System.out.println("비밀번호가 일치하지 않습니다" + "다시입력해주세요");
					}else{
						System.out.println("id와 비밀번호가 일치합니다");
						break; //해당하는 조건문의 바로 (while)윗단계를 빠져나온다
					}
				}
			} // 반복문의 끝
		
		
	}

}
