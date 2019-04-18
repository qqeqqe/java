package day09;

//다른 패키지에 있는 public 클래스를 사용하려면
//inport 패키지.클래스명;
//을 선언해야 해당클래스를 사용할수 있다


import java.util.Scanner;



public class tv01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//nextInt()는 Scanner 클래스의 멤버 메서드
		Scanner scan = new Scanner(System.in);
		int num1;
		num1 = 10;
		scan.close();
		
		Tv tv = new Tv();  
		tv.printChannel();
		
		System.out.println(Tv.BRAND);
		
		
		/*int num = scan.nextInt();
		next()는 Scanner 클래스의 멤버 메서드
		charAt()는 string 클래스의 멤버 메서드
		
		int ch = scan.next().charAt(0);*/
		
	}
}
/*  같은 패키지(day9)에서 동일한 클래스명을 가지는 클래스를 선언할 수 없다
class Tv {
}*/