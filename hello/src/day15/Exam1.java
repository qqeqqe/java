package day15;



public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Rect r = new Rect();
	r.width = 10;
	r.height = 5;
	r.canterX = 0;
	r.canterY = 0;
	r.print();
	System.out.println("-------------------");
	r.move(5, 5);
	r.print();
	System.out.println("-------------------");
	r.resize(10, 10);
	r.print();
		
	}

}



class Rect{
	public int width;
	public int height;
	public int canterX;
	public int canterY;
	
	public void print(){
		System.out.println("중심점" + canterX + "," + canterY);
		System.out.println("가로" + width);
		System.out.println("세로" + height);
		System.out.println("넓이" + width+height);
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