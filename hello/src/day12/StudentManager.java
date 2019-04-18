package day12;

import java.util.Scanner;

public class StudentManager {
	
	private Student std[ ];   //student 클래스에 있는 것을 링크하여 [학생들 정보를 담을 배열]
	private int count;		 //현재 저장된 학생 수
	private final int MIN_STUDENT_COUNT = 300;
	
	
	//위에 std가 프라이빗이기 때문에  생성자를 다시 만들어야 한다 
	public StudentManager(){  //학생 관리를 도와주는 클래스
		std = new Student[MIN_STUDENT_COUNT];  }
		
		public StudentManager(int studentCnt){
			
			if(studentCnt >= MIN_STUDENT_COUNT){
				std = new Student[studentCnt];
			
			
			}else{
				std = new Student[MIN_STUDENT_COUNT]; 
			}
		}
		
		
		
			
		public void insert(Student s){
			
			
			//검색을 해서 학년반번 번호를 검색해서 해당 학생 정보가 없으면 학생정보 추가
			//있으면 아무것도 안함
			
			int searchin = 
					search(s.getGrade(),s.getClassNum(),s.getNum());
			
			if(searchin == -1){ //-값이 될수 없기 때문에 아래 코드를 실행해라
				std[count++] = new Student(s);
							
				System.out.println("----------------------해당 정보가 입력 되었습니다");
				
				print();
			}
			
			
			/*if(searchin != -1){ //배열에는 -1 값이 없으므로 != 찾았다라는 의미
				for(int i =searchin ; i<count-1 ; i++){
				System.out.println("동일한 " + searchin + "을 찾았습니다");
				}*/
//			}
			
			
			
			//std[??] : Student 클래스의 객체는 초기에 선언만 되어있음
			//inset 기능에서 객체 정보를 추가하려면 객체를 생성한 후
			//매개변수의값을 복사 해야함.
			
			//std[count] = s; 를 하면 같이 정보가 같이 바뀌기 때문에 아래와 같이 new 라는 객체를 새로 생성해서 덮어씌운다.
			  //학생정보를 count=0; 에 저장해라 ...  
			 //학생 정보가 저장되었기 때문에 학생수를 증가시켜라 
		}
		
		
		
		// 기능  - 학생정보 전체 출력 --------------------------------------------------------------------------
		// 매개변수 - 없다 
		// 리턴타입 - void
		// 메소드명 -print
		public void print(){
			for(int i=0; i<count; i++){
				System.out.println(std[i]);
				
				System.out.println("----------------------해당 정보가 출력 되었습니다");
			}
		}
		
		
		
		
		
		//학생정보 검색 - 학생정보 수정 또는 삭제 하기 위해서 학생위치를알아야 하기 때문에
		//기능 - 학생정보 검색해서 없으면 -1를 있으면 배열에 위치한 번지를 알려주는기능
		//매개변수 - 학년,반,번호 => int grade,int classNum, int num
		//리턴타입 - int      // -1 또는 번지 =>int를 알려줘야 하기 때문에
		//메소드명 - search
		private int search(int grade,int classNum, int num){ 
			for(int i=0; i<count; i++){
				if(std[i].getGrade() == grade &&   
				   std[i].getClassNum() == classNum &&
				   std[i].getNum() == num ){
						return i; //찾은 학생의 정보를 i값으로 돌려준
			//만일 다른 페이지에 있는 클래스를 가져오려면 . 이 필요하다 (.)점의 의미는 [포함하다] 를 다루고 있는데
			//위에서 std를 컨트롤c로 눌러보면 다른페이지의 student를 참조 하고 있다
			//풀어서 이야기 하면 다른페이지의 Student 클래스의 [i 즉, 찾고 잇는 학년,반,순번]이 getGrade(접속기)와 같다면 = grade라는 뜻이다.
						
				}
			}
			return -1; //리턴값이 -1 인 이유는 배열은 0부터 시작하기 때문에 -1값을 찾을수 없기 때문이다.
		}
		
		
		
		
		
		/*
		기능 : 학생정보를 배열에서 수정 --------------------------------------------------------------------------
		매개변수 - 학생정보 => Student s
		리턴타입 - void
		메소드명 - modify
		*/
		
		public void modify(Student s){
			
			//검색 했을때 해당 정보가 있는 번지
			int searchIndex = 
					search(s.getGrade(),s.getClassNum(),s.getNum()); //학년 반 번호 
			//메소드를 적고 해당 안에 있는 매개변수를 적어야 불러올수가 있다
			
			if(searchIndex != -1){ //찾았으면 ~ //여기서 -1 인 이유는 배열의 처음이 0으로 시작하기 때문에 -1값이 될수 없다. 
				std[searchIndex] = new Student(s); //복사 생성자를 이용해 덮어 씌운다
				
				System.out.println("----------------------해당 정보가 수정 되었습니다");
			}
			}
		
		
		
		
		/*		기능 - 배열에서 학생정보 삭제 --------------------------------------------------------------------------
		매개변수 - 학생정보=>Student s
		리턴타입 - void 
		메소드명 - delete
		 */
public void delete(Student s){
	int searchIndex = 
			search(s.getGrade(),s.getClassNum(),s.getNum()); //학년 반 번호 
	
	
	if(searchIndex != -1){ //여기서 -1 인 이유는 배열의 처음이 0으로 시작하기 때문에 -1값이 될수 없다. 
		//배열 밀기
		for(int i =searchIndex ; i<count-1 ; i++){
		std[i] = std[i+1]; //뒤에 있는거를 앞쪽으로 옮겨라
		}
		
		std[count-1] = null; //마지막에 비어있는 값을 null 없다로 정의
		count -- ; // 그리고 총 갯수를 없에라
		
		System.out.println("----------------------해당 정보가 삭제 되었습니다");
	}						
	
}



			public static void printMenu(){ 
				System.out.println("1. 학생정보추가"); 
				System.out.println("2. 학생정보수정"); 
				System.out.println("3. 학생정보삭제"); 
				System.out.println("4. 학생정보출력"); 
				System.out.println("5. 종료"); 
				System.out.print("메뉴를 선택하세요 : "); 
				}

		
			
			
/*학색정보 추가 순서 2*/			
			public Student inputSearchStudent(Scanner scan){ 
				//매개변수 스캐너 스캔을 통해 아래 정보를 확인한다. 스캐너 스캔이 아닌경우 다른 매개변수를 이용한다
				
				Student s = new Student();
				System.out.println("학년");
				s.setGrade(scan.nextInt());
				
				System.out.println("반");
				s.setClassNum(scan.nextInt());

				System.out.println("번호");
				s.setNum(scan.nextInt());
				return s;
			}

/*학색정보 추가 순서 3*/
			public Student inputStudent(Scanner scan){ 
				Student s = inputSearchStudent(scan); // 해당객체 불러오기 // 해당 
				System.out.println("이름");
				s.setName(scan.next());  
				
				System.out.println("국어");
				s.setKor(scan.nextInt());
				
				System.out.println("영어");
				s.setEng(scan.nextInt());
				
				System.out.println("수학");
				s.setMath(scan.nextInt());
				return s;
			}
}