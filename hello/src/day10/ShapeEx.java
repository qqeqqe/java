package day10;

public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle c = new Circle(5,5,4);
		c.print();
		
		System.out.println();
		Rect r = new Rect(0,0,4,6);
		System.out.println();
		r.print();
		r.resize(2,1);
		r.print();
		
		
		Shape s1 = new Rect(0, 0, 0, 0);
		Shape s2 = new Circle();
		Shape s3 = new Shape();
		
		
		if(s1 instanceof Rect){
			Rect r1 = (Rect)s1;
			r1.print();
		}
		if(s3 instanceof Rect){
			System.out.println("객채s3은 Rect로 형변환이 가능");
		}
		
		System.out.println();
		Triangle t = new Triangle(9,9,2,9);
		r.print();
		
		
		
		
	}
}
