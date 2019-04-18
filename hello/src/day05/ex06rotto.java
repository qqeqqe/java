package day05;

public class ex06rotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*로또 번호는 1~45사이의 랜덤한 수가 중복되지 않도록
		7개 생성
		
		1. 랜덤한 수를 생성
		2. 생성된 수가 배열에 있는지 없는지 검색
		3. 없으면 생성된 수를 배열에 저장, i를 증가
		4. 있으면 아무일도 일어 나지 않는다
		
		*/
		
		int i = 0;
		int [] arr = new int [7];
			
		for(i=0 ; i<arr.length ; ){
			int r = (int)( Math.random()*(7-1+1)+1);
		 	boolean find = false;
						
			for(int j=0; j<arr.length ; j++ ){
				if(arr[j] == r){
					find = true;
					break;
				}    //검색하는 코드
			}
			
			if(!find){
				arr[i] = r;
				i ++;            //중복된 숫자가 없으면 다음칸으로 이동하라는 명령어
			}
		}
		
		
		
		for( int k=0; k<arr.length; k++){
			System.out.println("로또 번호는 :" + arr[k]);
		}
		
		
		
	
	}

}
