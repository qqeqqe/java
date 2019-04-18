package day09;

public class Point {
/*
	2차원 좌표의 점을 의미하는  point 클래스
	1 - 필요한 멤버변수 = X, Y
	2 - 생성자 - 
	
	 
	
	
	
*/
	
	private int x;
	private int y;
	
	public Point(){ //생성자
		move(0,0);
	}
	
	public Point(int x, int y){
		move(x,y);	
	}

	public Point(Point p){
		/*this(p.x,  p.y);*/
		move(p.x,  p.y);
		}

	
	/*3 - 필요한 멤버메서드 - 
	getter, setter*/
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/*x,y의 값이 주어졌을 때 멤버변수의 값 변경*/
	public void move(int x, int y){
		setX(x); //this.x = x;   //매개변수   
		setY(y); //this.y = y;   //매개변수
	}
	
	
	//현재 좌표 출력
	public void print(){
		//매개변수가 필요하지 않음
		//
		System.out.println("("+x+","+y+")");
	}
	
	
	//다른점과의 거리 계산
	public double distance(Point p){
		return distance(p.x, p.y);
		}
	
	public double distance(int x, int y){
		int dx = x - this.x;
		int dy = y - this.y;
		return Math.sqrt(Math.pow(dx,2.0)+Math.pow(dy, 2.0));
	}
	
	public void moveUp()   { y--; }
	public void moveDown() { y++; }
	public void moveLeft() { x--; }
	public void moveRight(){ x++; }
	/*public double distance(int x, int y){
		return 0.0;
	}*/
	
}//클래스 끝

	