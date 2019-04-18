package day10;

public class Circle extends Shape {

	private int radius;

	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override // 오버라이드 에서 잘못된 문장을 잡아준다
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.print("반지름 : " + radius);
		System.out.println();
		}
	
	
	
	public Circle(){
		//super(); 생성된 상태이지만 안보임
	}
	public Circle(int x, int y, int r){
		super(x,y,r,r);  //슈퍼라는 말은 부모클래스의 생성자
		radius = r;
	
	}
}