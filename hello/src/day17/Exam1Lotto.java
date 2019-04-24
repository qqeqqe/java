package day17;

import java.util.*;

public class Exam1Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lotto = randomArr(1,45,7);
		List<Integer> list = randomArr(1,45,6);
		System.out.println(lotto);
		System.out.println(list);
		
		
		System.out.println("포함된 계수 " + countList(lotto, list));
		
		printRank(lotto, list);
	}
	
	/*
	기능 : min, max가 주어지면 해당 범위에서 중복되지 않는 랜덤한 수를
		 count갯수만큼 생성하여 리스트로 반환하는 메서드
	매개변수 : min, max, count
	리턴타입 : List
	*/
		
	public static List<Integer> randomArr(int min, int max, int count){
		// 중복되지 않는 정수를 만들어 주는 메소드
				
	          /*45-1+1 < */
		if(max-min+1 < count)
		//생성할수 있는 숫자의 범위보다 만들어야 하는 갯수가 더 크면 중복될수 밖에 없기 때문에 무한루프에 빠지기는 경우가 생길것을
		//막기 위한 코드
		return null;
		
		Set<Integer> set = new HashSet<Integer>();   //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		while(set.size()<count){  // 해당하는 set.size가 count 갯수보다 작을때 실행
			// set.size() 는 현재 0의 숫자를 저장하고 있다. set이라게 중복을 허용하지 않으므로 반복문을 통해
			//중복되는 값을 없에고 중복되지 않는 값을 계속 저장한다.
			
			int num = (int)(Math.random()*(max-min+1))+min;  //랜덤공식을 구해서 num에 저장하는 코드
			
			set.add(num);  // (랜덤한 num) add를 이용해 set에 추가
		}
		
		
		List<Integer> list = new LinkedList<Integer>(set);
		//set으로 저장되어 있는 데이터들을 List 데이터들로 변환
		//왜냐하면 set은 직접적으로 접근할수 있는 get가 없기 때문이다.
		//List로 변환하여 List에 있는 get()에 접근하기 위해 변환시킴
		
		return list;
}		
		
	//기능 : 로또 당첨번호와 번호들이 주어지면 보너스 번호를 제외하고 일치하는 갯수가 몇개인지 알려주는 메소드
	//매개변수 : 당천번호들 = > list<Integer> lotto
	// 번호들 => List<Integer> list
	//리턴타입 => 갯수 = > int
	//메소드명 => countList
		
		
	public static int countList(List<Integer> lotto, List<Integer> list){ //인티저라고 해놓으면 정수와 null 값만 지정
	//로또번호에 리스트 번호가 있는지 확인
		
		if(lotto.size()<list.size())
			// 첫번째 매개변수가 당첨번호가 되어야 하는데 당첨번호가 아닌
			// 번호가 오면 -1를 리턴후 종료
			return -1;
		
		
		
		
		int count = 0;
		//당첨번호에서 원소(번호)를 하나 꺼내서 , 꺼낸 원소가 list에 있는지 없는지 확인하여 이씅면 count에 증가, 없으면 아무것도 안함
		for(int i =0; i<list.size(); i++){
			
			if(list.contains(lotto.get(i))){  
				//여기서 get은 접근. lotto의 i번지에 접근하여 그 수가 list에 포함되어 있는지 true과 fasle값으로 돌려준다.
				
				count ++; // 있으면 카운터를 1개 증가시킨다.
			}
		}
		return count;
	}
	
	
	
	
	public static void printRank(List<Integer> lotto, List<Integer> list){//인티저라고 해놓으면 정수와 null 값만 지정
		int count = countList(lotto, list);
		int rank = 0;
		
		int bonusNum = lotto.get(lotto.size()-1); //보너스 번호와 일치하는 번호가 있는지 없는지
		boolean checkBonus = list.contains(bonusNum); //보너스 번호가 포함되어 있는지 없는지
		
		switch(count){
		case 6 : rank = 1; break;
		case 5 : rank = checkBonus?2:3; break; // 체크 보너스 갯수가 5개야?트구면  2등    false 3등
		case 4 : rank = 4; break; 
		case 3 : rank = 5; break;
		default: rank =-1;
		}
		
		if(rank>0){
			System.out.println(rank + " 등 당첨!");
		}else{
			System.out.println("꽝!!");
		}
	
	}
	
	
} // 메인의 끝


