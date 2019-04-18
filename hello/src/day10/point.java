package day10;

import java.awt.Point;

public class point {  //public 접근제한자         class 클래스 선언

	private int x;
	private int y;

	public int getX() {  //리턴값이 있는 멤버 매소드 
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
	
	public void print(){
		System.out.println("("+x+", "+y+")");
	}
	
	public void move(int x, int y){  //메소드 오버로딩
		this.x = x;
		this.y = y;
		
	}
	
	public void move(point p)		{		move(p.x, p.y);	}
	public point()					{		move(0,0);		}
	public point(int x, int y)		{		move(x,y);		}
	public point(point p)			{		move(p);		}
	
}

