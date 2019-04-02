package day6;

public class ex6번호확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*기능 - 배열에 검색숫자가 있는지 없는지 확인하는 메소드
		
		매개변수 - 검색숫자,배열 => int[] arr, int num
		리턴타입 - boolean
		메소드명 - isContain*/
		
		int min = 0, max=10;
		int r = random(min,max);
		int [] arr = new int[]{1,2,3,4,5,6,7};
		
		System.out.println(r);
		System.out.println(contain(arr, r, arr.length)); // arr 배열에  (r=랜덤한 수)가  배열에 끝에까지 갈때 있는지
	}

	
	
	
	public static int random(int min,int max){
	 	return (int)(Math.random()*(max-min+1)+min);	
}

	
	
	public static boolean contain(int [] arr,int num,int cnt){
		if(arr == null){
			
		}
		
		if (cnt > arr.length){
	 		cnt = arr.length;
	 	}
	 	for(int i =0; i<cnt ;i++){
	 		if(arr[i] == num){
	 			return true;
	 		}
	 	}
		return false;

}
	
	
}
