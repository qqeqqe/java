package day11;



public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s = new Shape();
		s.print();
		Shape.printCount();
		
		Circle c = new Circle(5,5,5);
		c.print();
		c.move(3, 3);
		
		c.print();
		c.resize(10);
		c.print();
		Circle.printCount();
		
		Shape s2=c;
		Shape.printCount();
		//자식 클래스를 부모클래스로 변환할때에는 자동 형 변환이 가능하다.
		
		//부모클래스를 자식클래스로 변환할 때에는 명시적 형 변환을 해야한다.
		//조건부로 가능 => 조건을 만족하지 않으면 사용할때
		// 에러 - classCassExceotion이 발생할수 있다
		//클래스형변환 에러로 변환은 했지만 사용할수 없는 정보가 있어서
		//사용하지 못하는 경우
		
		 
		/*Circle c2 = (Circle)s;*/
		//c2.print(); 실행시 에러발생
		
		Shape s3 = new Circle(); //형변환 하는 방법 // 부모클래스를  자식클래스로 바꾸는 방법 //명시적형변환 
		Shape.printCount();
		
		Circle c3 = (Circle)s2; // Circle c3 클래스는 = (부모클래스 Circle) Shape s2클래스를 형변환 함
		c3.print();
		Circle.printCount();
	
	}
}
