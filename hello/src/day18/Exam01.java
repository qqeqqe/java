package day18;

public class Exam01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Card c = new Card();
		
		
		
		System.out.println(c.kind);
		c.kind = Card.Kind.CLOVER;
		System.out.println(c.kind.ordinal());  // 오디널은 순서를 리턴한다는 의미
		System.out.println(c.kind.name());  
		
		System.out.println(Card.Kind.valueOf(c.kind.name()));
		
	}

}


 enum CardNum{ ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K}
	
	
	
	
