package day나의연습장;

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square r = new Square();
		r.width   = 1;
		r.height  = 1;
		r.canterX = 0;
		r.canterY = 0;
		
		
		
		r.print();
		System.out.println("--------------");
		r.move(5,5);
		r.print();
		System.out.println("--------------");
		r.resize(10, 10);
		r.print();
	}

}


class Square{
	public int width;
	public int height;
	public int canterX;
	public int canterY;
	
	
	public void print(){
		System.out.println("중심점" + canterX + "," + canterY);
		System.out.println("가로" + width);
		System.out.println("세로" + height);
		System.out.println("넓이" + width+height)	;
		}
	
	
	
	public void move(int x, int y){
		this.canterX = x;
		this.canterY = y;
	}
	
	
	
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	
}