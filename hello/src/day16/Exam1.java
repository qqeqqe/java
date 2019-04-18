package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();  //정수를 저장하는 객체 or null 값도 들어간다
		list.add(10);     /* == 왼쪽과 같다    list.add(new Integer(10));  */
		list.add(5);
		list.add(1);
		
		/*for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/

		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt = new Point(5,5);
		
		char mode = 'y';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("이동할 좌표를 입력하세요 (예: 1 2)");
		int x = scan.nextInt();
		int y = scan.nextInt();
		pt.move(x, y);
		System.out.println("이동할 현재 좌표 : " + pt);
		System.out.println(new Point(pt));  //익명 메서드 .. 바로 바로 사용하기 위해서
		System.out.println("더 하시겠습니까?? (y or n )");
		mode = scan.next().charAt(0);
				
		}while(mode != 'n');
		
			
		for(int i=0; i<pList.size(); i++){
			System.out.println(pList.get(i));
		}
		
		
		
		
		
	}
}

class Point{
	private int x;  //멤버변수 
	private int y;
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public Point(){
		}
	
	public Point(int x, int y){
		this.x=x; this.y=y;
	}
	
	
	public Point(Point p){
		this(p.x, p.y);
	}
	
	public void move(int x, int y){
		this.x = x; this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
		
		
		
		
	}
	@Override
	public int hashCode() {  
		// 객체가 어느그룹에 속해 있는지 알려주는 메소드
		//포인트 클래스에서는 x,y의 값이 같다면 다른 객체이더라도
		//같은 그룹에 속하기 때문에 검색을 빠르게 할수 있다.
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	// 두 객체가 같은 객체로 판펼할 것인지를 결정하는 메서드
	@Override
	public boolean equals(Object obj) {
		//주소가 같은경우면 당연히 본인이기 때문에 같은 객체
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		//포인트 클래스에서 같은 객체는 x와 y가 같은 경우이다로 설정함
		
		if (x != other.x)  //요놈이 핵심
			return false;
		if (y != other.y)  //요놈이 핵심
			return false;
		return true;
	}
	
	
	
	
	
}
