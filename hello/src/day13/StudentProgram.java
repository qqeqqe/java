package day13;

import java.util.Scanner;

import day12.StudentManager;
import day12.Student;
import day12.Studentmain;

public class StudentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//StudentManager 의 객체 멤버 메소드 printMenu를 호출하기 위해 StudentManager객체를생성 
		
		StudentManager mng = new StudentManager(); //StudentManager mng 는 변수선언 or 인스턴스화 
		Student Infor = new Student(); 
		Studentmain main = new Studentmain();
				
		
		
		int menu = 0;
		
		Scanner scan = new Scanner(System.in);
	
			
		
		
		
			for( ; menu != 5 ; ){
			mng.printMenu();
			menu = scan.nextInt();

			Student s;  //학생 정보를 저장할수 있는 객체를 생성하자..그래야 어디에 저장할지 아니깐
			
			switch (menu) {
			case 1:	

				
				/*학색정보 추가 순서 1*/			
			System.out.println("추가할 학생정보 추가입니다.");
			s = mng.inputStudent(scan); 
				// day13의 변수 mng 에 포함되어있는  day12패키지  StudentManager(scan) 을... s에 저장한다.
			mng.insert(s); //day13 변수 mng에 day12패키지 intsert(s)를 포함시키다
			break;
			
			case 2: System.out.println("학생정보 수정입니다.");      
			s = mng.inputStudent(scan);
			mng.modify(s);
			break;
			
			
			case 3: System.out.println("학생정보 삭제입니다.");      
			s = mng.inputSearchStudent(scan);
			mng.delete(s);
			break;
			
			
			case 4: System.out.println("학생정보 출력입니다."); 	//학생정보 모두를 출력하시오      
			mng.print(); 		
			break;

			
			case 5:System.out.println("---프로그램을 종료합니다---");
			break;
			
			
			default:  // 나머지 값
				System.out.println("잘못된 메뉴");
				break;
			}
		}
	}

	/*2*/ //검색을 위한 정보 메서드
	
}


		
	


