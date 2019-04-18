package day05;

public class ex10목록검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sarch = 6;   //검색되는 부분
		
		int [ ]num = new int[ ]{1,2,3,4,5};
		boolean find = false; // 참, 거짓 정하는 부분,, 미리 거짓이라고 가장한다
		
		
		for(int tmp : num /*배열된것들*/ ){
			if(tmp == sarch){
				find = true; //만일 find 값이 tmp == 서치와 동일하다면 true 
				break;
			}
		}
		
		if(find){
			System.out.println("있음");
			
		}else
			System.out.println("없음"); 
				
		
		
		
	}

}