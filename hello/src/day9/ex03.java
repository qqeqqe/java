package day9;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*기본 생성자를 이용한 객체 생성 후 초기화*/
			Tv t1 = new Tv(/*여기가 생성자 자리*/);  //연산자 new가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는것이 아님
			t1.printChannel();
			t1.printVolumn();
			
			System.out.println();
			//생성자를 오버로딩을 이용한 객체 생성 후 초기화
			Tv t2 = new Tv(100,15);
			t2.printChannel();
			t2.printVolumn();
			
			System.out.println("1*******");
			
			//t3를 생성해서 t2의 값으로 초기화
			Tv t3 = new Tv(t2);
			t3.printChannel();
			t3.printVolumn();
			
			System.out.println("2*******");
			t3.volumnDown();
			
			System.out.println("3*******");
			t3.printVolumn();
			
			System.out.println("4*******");
			t2.printVolumn();

			//t4를 생성하지 않고 t3의 다른 이름으로 t4라 부른다
			Tv t4 = t3;
			System.out.println("5*******");
			t3.printVolumn();
	}
}