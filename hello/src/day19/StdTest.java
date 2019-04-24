package day19;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StdManager sMng = new StdManager();
			
			int menu = 0;
			Scanner scan = new Scanner(System.in);

			do{
				sMng.printMenu();
				menu = scan.nextInt();
				
				
				switch (menu) {
				case 1: 
					Std s = sMng.inputStd(scan);	
					if(sMng.insert(s))     
						System.out.println("학생정보를 추가 했습니다.");
					else
						System.out.println("이미 등록된 학번 입니다.");		break;
				case 2:
					Std s2 = sMng.inputStd(scan);	
					if(sMng.update(s2))     
						System.out.println("학생정보를 수정 했습니다.");
					else
						System.out.println("없는 정보 입니다.");			break;
				case 3:
					Std s3 = sMng.inputId(scan);	
					if(sMng.delete(s3))     
						System.out.println("학생정보를 삭제 했습니다.");
					else
						System.out.println("없는 정보 입니다.");			break;
				case 4:   
					sMng.print();									break;
				case 5:   break;
					
					

				default:System.out.println("잘못된 메뉴를 선택 했습니다.");
					
				}
				
			}while(menu != 5);
			scan.close();
			
			
			/*sMng.insert(new Std("홍길동","20190419","한국대","컴퓨터",0.0));
			sMng.insert(new Std("길동이","20190419","한국대","컴퓨터",0.0));  // set 기능으로 인해 학번중복이라 표기 안됨
			sMng.insert(new Std("유관순","20190417","한국대","컴퓨터",0.0));
			
			sMng.print();
		
			System.out.println("-----------------------------------------------");
			sMng.delete(new Std("유관순","20190417","한국대","컴퓨터",0.0));
			sMng.print();

			System.out.println("-----------------------------------------------");
			sMng.update(new Std("이순신","20190416","한국대","컴퓨터",0.0));
			sMng.print();*/
	
	}

}
