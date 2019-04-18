package day10;

public class ex03추상메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//추상메서드는 구현부가 없다 . 그래서 자식 클래스에서 오버라이딩에서 빈번하게 발생하는 경우에
//해당 메서드를 구현하지 않고 추상메서드로 선언후에 자식 클래스에서 구현하도록 한다.

abstract class Shape2{
	int x, y;
	int w, h;
	
abstract void print();
	
}



class Rect2 extends Shape2{

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	
	
}

//추상메서드를 사용하려면 추상 클래스를 상속받는 자식클래스를 만들고
//만들어진 자식 클래스에서 메서드 오버라이딩을 통해 구현한후 사용한다.
//추상 클래스를 상속받으면 추상 메서드를 반드시 오버라이딩을 통해
//구현해야 한다.