package day05;

public class ex04arrayrendom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 7개를 저장할수 있는 정수형 배열을 생성하고
		//각번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 
	    // 코드를 작성하세요
		
		
		int i = 0;
		int [] b = new int [7];
	
		
		for(i=0 ; i<b.length ; i++){
			b[i] = (int)( Math.random()*(45-1+1)+1);
		 	System.out.println(i + "번째 " + "랜덤수는" + " " +b[i]);
		}
		
		
	}

}
