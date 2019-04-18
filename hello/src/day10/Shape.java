package day10;

public class Shape {

	
	
	protected point center;
	protected int width;
	protected int height;
	
	
	
	
	public point getCenter() {
		return center;
	}
	public void setCenter(point center) {
		this.center = center;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void print(){
	System.out.print("중심점 : ");
	center.print();
	System.out.print("가로 : " + width);
	System.out.println();
	System.out.print("세로 : " + height);
	}
	
	
	
	public Shape(){
	center = new point();
	}
	
	public Shape(int x, int y, int width, int height){
			center =  new point(x,y);
			this.width = width;  this.height = height;
			
	}
}

