package day56;

import java.util.ArrayList;
import java.util.Collections;

public class exam1 {

	public static void main(String[] args) {
		CardPack2 cp = new CardPack2(); // 카드팩 하나 만들어 논다
		// cp.show();

		ArrayList<Card2> user = new ArrayList<Card2>();
		ArrayList<Card2> dealer = new ArrayList<Card2>();
		for (int i = 1; i < 10; i++) {
			user.add(cp.give());
			dealer.add(cp.give());

		}
		System.out.println(user);
		System.out.println(pockrule.triple(user));
		System.out.println(dealer);
		System.out.println(pockrule.triple(dealer));
	}
}



class pockrule {
	public static int pare(ArrayList<Card2> list ){
	/*  기능 : 페어를 찾는 메서드
	매개변수 : 카드 리스트
	리턴타입 : 0 : 페어없음, 1: 원페어 , 2: 투페어 (페어가 2개이상)*/
	
		int pareCnt = 0 ;
		for (int i = 0; i<list.size(); i++){
			int cnt = 0; // 같은 숫자의 갯수
			for(int j = 0 ; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 2){			
				pareCnt++;}
			}
		return pareCnt/2;
	}

	
	
	

	
	
	
	
	public static int triple(ArrayList<Card2> list ){
		 /* 기능 : 페어를 찾는 메서드
		매개변수 : 카드 리스트
		리턴타입 : 0 : 페어없음, 1: 원페어 , 2: 투페어 (페어가 2개이상)*/
		
			int pareCnt = 0 ;
			for (int i = 0; i<list.size(); i++){
				int cnt = 0; // 같은 숫자의 갯수
				for(int j = 0 ; j<list.size(); j++){
					if(list.get(i).getNum() == list.get(j).getNum()){
						cnt++;
					}
				}
				if(cnt == 3){			
					pareCnt++;}
				}
			return pareCnt/3;
		}
	
	
	/*Collections.sort(list, new Comparator<card>()*/
	
}


class CardPack2 {
	private ArrayList<Card2> list = new ArrayList<Card2>();

	public CardPack2() {

		cardPackSetAll(); // 새로운 카드팩을 만든다
		shuffle(); // 카드를 섞는다

	}

	/* 기능 : 모양이 주어지면 해당 모양의 1번카드부터 K카드까지 팩에 추가 */
	private void cardPackSet(Shape s) {
		for (int i = 1; i <= 13; i++) {
			Card2 c = new Card2();
			c.setNum(i);
			c.setShape(s);
			list.add(c);
		}
	}

	public void cardPackSetAll() {
		list.clear();
		cardPackSet(Shape.S);
		cardPackSet(Shape.C);
		cardPackSet(Shape.H);
		cardPackSet(Shape.D);
	}

	// 현재 카드팩 내용을 보여주는 메소드
	public void show() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

	// 카드팩을 섞는 메서드
	public void shuffle() {
		Collections.shuffle(list);
	}

	// 카드팩에서 아래에서 한장을 꺼내는 메서드
	public Card2 give() {
		if (list.size() != 0) {
			Card2 c = new Card2(list.get(0));
			list.remove(0);
			return c;
		} else {
			return null;
		}
	}
}

class Card2 {
	private int num;
	private Shape shape;

	public int getNum() {
		return num;
	}

	public String getShape() {
		switch (shape) {
		case H:
			return "♥";
		case D:
			return "◆";
		case S:
			return "♠";
		case C:
			return "♣";
		}
		return null;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		String s = new String();
		s += getShape();

		if (num == 11)
			s += "J";
		else if (num == 12)
			s += "Q";
		else if (num == 13)
			s += "K";
		else
			s += num;
		return s;
	}

	public Card2() {
	}

	public Card2(Card2 c) {
		this.num = c.num;
		this.shape = c.shape;
	}
}

enum Shape {
	H, D, S, C
}