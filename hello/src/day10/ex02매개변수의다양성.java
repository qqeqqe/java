package day10;

public class ex02매개변수의다양성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		t.price = 100;
		t.bonusPoint = 1;
		
		Computer c = new Computer();
		c.price = 50;
		c.bonusPoint = 1;
		
		Audio a = new Audio();
		a.price = 200;
		a.bonusPoint = 5;
		
		Buyer buyer = new Buyer();
		buyer.buy(c);
		System.out.println("컴퓨터 산후 남은 금액: "+buyer.money);
		
		buyer.buy(a);
		System.out.println("오디오 산 후 남은 금액: "+buyer.money);
		
		buyer.buy(t);
		System.out.println("오디오 산 후 남은 금액: "+buyer.money);
	}

}

class Product{
	int price;
	int bonusPoint;
}

class Tv extends Product{}          //자식클랙스1
class Computer extends Product{}	//자식클랙스2
class Audio extends Product{}		//자식클랙스3


class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	//원레 매개변수로 Tv T 또는 computer c 또는 Audio a
	//가 와서 메서드 오버로딩으로 구현해야 하지만 그럴경우
	//product를 상속받는 제품들이 만하지만 추가해야할 메서드가 늘어난다.
	// 그래서 각 클래스의 객체가 아닌 해당 클래스들의 부모인 
	//product 클래스를 매개변수로 처리하면 product 클래스를 상속받는 제품들은 일광 처리가 된다.
	
	
	void buy(Product p){
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
}