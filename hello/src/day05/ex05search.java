package day05;

public class ex05search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 검색하는 방법
		
		
		
		
		
	//배열 : 0 1 2 3 4 
		
		/*배열에 있는 모든값을 확인하여
		배열의 값과 검색값이 같으면 반복문을 종료
		없으면 계속 진행*/
		
		/*변수 search의 값이 배열 arr에 있는지 없는지를 나타내는 변수*/
		
		
		
		int[]arr =new int[5];
		for(int i=0; i<arr.length ; i++ ){
			arr[i] = i;
		}
		
		
		int search = 6;
		boolean find = true;
		
		for(int i=0; i<arr.length ; i++ ){
			if(arr[i] == search){
			find = false;
			break;
			}
			
			
			
		}
		
		
		if(find)
	System.out.println("배열에는 " + search + "가 있습니다");
	else {
		System.out.println("배열에는 " + search + "가 없습니다");
	}
	 
	
	
	

	}
}
