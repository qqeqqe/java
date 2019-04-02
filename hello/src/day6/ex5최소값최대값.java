package day6;

public class ex5최소값최대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int min = 1, max=20;
		int rend = (int)(Math.random()*(max-min+1)+min);
		
		System.out.println(random(min,max));
	}
	
	
	
	/*기능 - 최소값(min)과 최대값(max)가 주어지면 최소값과 최대값사이의 임의의 정수를 알려주는 메소드
	
	매개변수 - 정수 = int min, int max
	리턴타입 - int
	메소드명 - random*/
	
	
	
	public static int random(int min,int max){
		 	return (int)(Math.random()*(max-min+1)+min);	
	
	}	
}		