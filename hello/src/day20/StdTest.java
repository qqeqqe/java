package day20;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		StdManager sMng = new StdManager();
		// 학생 한명 정보를 만들고
		// 학생 한명의 정보에 과목을 추가하고
		// 평점을 확인
		// String name,String id,String sName, String major, double avr
		/*
		 * Std std = new Std("홍길동","2019100100","서울대","컴퓨터",0.0);
		 * System.out.println(std); std.insertSbuject(new
		 * Grade("A+","세종대왕","한글",3)); System.out.println(std);
		 * std.insertSbuject(new Grade("B","이순신","해상학",2));
		 * System.out.println(std);
		 */

		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do {
			// 메뉴 출력
			sMng.printMenu();
			// 메뉴 선택
			menu = scan.nextInt();
			Std std;  // 스캐너를 입력 받은 
			Std result; // 스캐
			int subMenu;
			switch (menu) {
			case 1:
				std = sMng.inputStd(scan);
				if (sMng.insert(std))
					System.out.println("학생정보를 추가 했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2:
				/*
				 * 기존 : 학생 정보를 입력받고 학생정보를 추가 변경 : 2번 선택시 학생정보 수정 또는 과목 등록을 할 수
				 * 있게 한다.
				 */
				// 메뉴 출력
				System.out.println("2-1.학생정보 수정");
				System.out.println("2-2.학생 수강과목 등록");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				// 메뉴 선택
				subMenu = scan.nextInt();

				// 선택된 메뉴에 따라 해당 기능 동작
				if (subMenu == 1) {
				
					std = sMng.inputStd(scan);
					if (sMng.update(std))
						System.out.println("해당 학생 정보를 수정 했습니다.");
					else
						System.out.println("없는 학번입니다.");
				} else if (subMenu == 2) {
					// 과목 추가하는 기능 작성

					std = sMng.inputId(scan);
					result = sMng.search(std);

					// 해당 학생정보가 없으면 해당 기능 종료
					if (result == null) {// 조건식 참또는 거짓만들어간다
						System.out.println("없는 학번입니다.");
						break;
					}

					Grade grade = sMng.inputSubject(scan);
					result.insertSbuject(grade);
					// 매니저에 학생정보 수정 (Stdmanager.update()이용)
					sMng.update(result);

				}

				break;
				
				
				
				
			case 3:
				std = sMng.inputId(scan);
				if (sMng.delete(std))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 4:
				// 서브 메뉴 출력
				// 1.전체 학생 출력
				// 2.학생수강 과목 출력
				// 서브 메뉴 선택 => 서브메뉴입력
				// 조건문을 서브메뉴가 1이면
				// 전체 학생출력
				
				// 서브메뉴가 2이면
				// 학생 수강 과목을 입력 받아 객체로 만들고
				// 학생정보 입력 => Stdmanager.inputId()
				// 입력받은 학생과 일치하는 학생의 정보를 가져온다 => StdManager.search()
				// 해당 학생 객체의 수강과목을 출력하고 => std.pinrtSubject() 메소드 추가
				// 없으면 아무것도 안한다.
				
				System.out.println("4-1.전체학생출력");
				System.out.println("4-2.학생수강 과목 출력");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				subMenu = scan.nextInt();
			
				if (subMenu == 1) {
				sMng.print(); // 전체 학생 출력  
				System.out.println("전체 학생 목록이 출력 되었습니다.");
				break; }
					
				else if (subMenu == 2) {	
				std = sMng.inputId(scan);
				result = sMng.search(std);
				if(result == null){
					System.out.println("해당 학번 학생이 없습니다");
				}else if(!result.printSubject()){
					System.out.println("수강할 강의가 없습니다.");
				}
				}
				break;
						
				
			case 5:
				break;
			default:
				System.out.println("--------------------");
				System.out.println("잘못된 메뉴를 선택했습니다.");
				System.out.println("--------------------");
		}
		} while (menu != 5);
		System.out.println("프로그램 종료합니다.");
		scan.close();

	}

}
