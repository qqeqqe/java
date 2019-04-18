package day10;

public class Triangleex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle t1 = new Triangle();
		t1.print();
		Triangle t2 = new Triangle(1,1,3,3);
		t2.print();
	
		Triangle t3 = null;
		t3.print();
		/*에러 내용 : NullpointerException
		에러 원인 : 참조변수가 null 값을 가지는데 해당변수를 사용했을 경우에 생기는 에러
		일반적으로 클래스의 객체를 선언만 하고 new를 생성하지 않는 상태에서 해당객체의 메소드를 호출하는 경우 발생한다
		
		해결방법 : 객체를 생성하고 호출하면 된다.*/
		
	}
}
