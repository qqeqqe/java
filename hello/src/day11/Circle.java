package day11;

public class Circle extends Shape { //Shape 라는 클래스를 Circle 로 상속 받는다.

	
	public double getRadius(){  
		return getWidth()/2.0;  //가로의 합 /2 를 하여 반지름을 구한다
	}
	
	public double getArea(){ 
		return getRadius()*getRadius()*Math.PI;
				//반지름 * 반지름 * 파이 = 넓이를 구하는 공식
		}
	
	@Override // 기존의 메서드를 불러와 새로운것으로 덮어 쓸수 있다
	public void print(){
		System.out.println("---------------------");
		System.out.println("중심점 : ");
		getCenter().print();  // 간접적으로 접근할수 있는 getcenter 적용
		System.out.println("반지름 : +  " + getRadius());
		System.out.println("넓이 : + " + getArea());
		System.out.println("---------------------");
	}

	void resize(double r){ // 반지름 r 에 대한 메서드
		setWidth(r*2);  // 가로 곱하기 2
		setHeight(r*2); // 세로 곱하기 2
	}

	
	public Circle(){ } //생성자생성,
	public Circle(int x,int y, int r){
		super(x,y,r*2,r*2); //가로 , 세로 , width , height
	}
	
	
}