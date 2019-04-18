package day17;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Exam2baseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		선택된 중복되지 않는 1~9사이의 3개의 숫자를 맞추는 게임
		스타라이크 : 자리수와 숫자가 일치하는 경우
		볼 : 해당 숫자는 있지만 자리수가 안맞는 경우
		3out : 일치하는 숫자가 없는 경우
		3s : 전부다 일치 ==> 게임종료
		
		com : 139
		123		1S 1B
		456		3Out
		789		1S
		913		3B
		139		*/
		
		// 1. 컴퓨타가 1~9까지의 랜덤한 숫자 3개를     ok
		// 2. user 가 콘솔창으로 3개의 숫자를 입력 받기 ok 
		// 3. 내가 입력한 숫자가 컴퓨터 숫자와 같은지  
		// 4. 맞은 갯수와 틀린 갯수를 표시
		// 4-2. 어떻게? 스위치 문으로 이용하면 될듯
		// 5. 내가 입력한 갯수에 따라 맞게 출력 되는지
		
		List<Integer> com = Exam1Lotto.randomArr(1, 9, 3);  // 전에 만들었던 것을 가져옴
		List<Integer> user = new LinkedList<Integer>();  // 유저의 값을 저장할 그릇을 만듬
		
		System.out.println(com);
		
		int strike=0;
		int ball=0;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		//2번
		while(strike<3){
			user.clear(); // 시작하기전에 유저라는 통에 있는걸 초기화 하고 시작해
			
			user = inputNums(scan);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			
			
			//3 입력받은 값을 user에 저장
			user.add(num1);
			user.add(num2);
			user.add(num3);

			
			
			
			
			//5 번째 만들기
			strike = getStrike(com, user);
			ball = Exam1Lotto.countList(com, user) - strike;
			if(strike !=0)
				System.out.println(strike + "S");
			if(ball !=0)
				System.out.println(ball + "B");
			if(strike ==0 && ball == 0)
				System.out.println("삼진 아웃");
			System.out.println();
		}
		System.out.println("정답입니다.");
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		
		

		}


	//4 번째 제작
	public static int getStrike(List<Integer> com,List<Integer> user){  //맨 위에서 만듬 객체들
		int count = 0;
		for(int i = 0; i<com.size(); i++){
			if(com.get(i).equals(user.get(i))) // 
				// 이퀄스 대신 == 를 붙이면 값이 서로 값다라고 된다. com.get(i)는 참조변수이기 때문에 user.get(i)값도 바꿔 버리기 때문에
				// 이퀄스를 이용해 같은지 아닌지 확인한다.
				
				count++;
		}
		return count;
	}
	
	/*public static void print()*/ 
	
	public static List<Integer> inputNums(Scanner scan){
		/*Set<Integer> set = new HashSet<Integer>();
		
	}
	
	Iterator<Integer> it = set.iterator();
	List<Integer> list = new LinkedList<Integer>();
	while(it.hasNext()){
		list.add(it.next());
	}*/
		List<Integer> list = new LinkedList<Integer>();
		while(list.size() < 3){
			int num = scan .nextInt();
			list.add(num);
		}
	
		return list;	
	}
}