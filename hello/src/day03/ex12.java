package day03;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
	******   i=1 공=0  *=6
	*****    i=2 공=0  *=5
	****     i=3 공=0  *=4
	***      i=4 공=0  *=3
	**       i=5 공=0  *=2
	*        i=6 공=0  *=1
	                    공=6-i *=7-i
	         여기서 i는 줄이 몇번째라는 의미        		 
			 */
		
		
		int a = 0;
		int i = 0;
		
		
		for(i=1 ;i<=6 ;i++ ){ //이거는 몇번째 줄까지 내려 가는 의미?
		 	for(a=1; a<=7-i ; a++ ){ // 현재 클래임에서 아래의 출력 이미지를 몇개나 출력 
		 		//i값이 초기에 1이기 때문에 7-1이 되어 ******개 나오고
		 		//프린터인이 출력되어 엔터가 한번되고
		 		//그이후 다시 처음부터 돌기 때문에 
		 	System.out.print("*"); //화면에 우측으로 출력하는 이미지
		 	
		 	}
		 	System.out.println(); //프린터 인은 엔터의 의미가 있다
		 	}
		
		
	}

}
