package day12;

public class Studentmain {

	public static int MAX_STUDENT_COUNT=300;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager stdMng = new StudentManager(MAX_STUDENT_COUNT);
		stdMng.insert(new Student("홍길동",1,1,1,100,90,80));
		stdMng.print();
		//여기서 stdMng 는 익명개체이다 . 보통 객체를 생성할때 new stdMng[] 만들기 때문이다.
		
		stdMng.modify(new Student("유관순",1,1,1,100,100,100));
		System.out.println("--------------------");
		stdMng.print();
		stdMng.delete(new Student("",1,1,1,0,0,0));
		
		System.out.println("--------------------");
		stdMng.print();
		}
		
		
		public static void printMenu(){ 
			System.out.println("1. 학생정보추가"); 
			System.out.println("2. 학생정보수정"); 
			System.out.println("3. 학생정보삭제"); 
			System.out.println("4. 학생정보출력"); 
			System.out.println("5. 종료"); 
			System.out.print("메뉴를 선택하세요 : "); 
		} 

}


