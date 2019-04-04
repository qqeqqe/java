package day6;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		기능 - 배열이 주어지면 중복되지 않는 랜덤한 수(min~max)로 배열을 채우는 메서드
		
		매개변수 - int min,int max,
		리턴타입 - int
		메소드명 - createRandArr  
		
1.랜덤한 수(1~45)
2. 중복안되게 하기
3.7개짜리, 6개짜리

1. 랜덤한 수를 생성하는 메소드 : random
2. 배열에 검색하려는 수가 있는지 없는지 확인하는 메소드 : contain
3. 배열을 생성(1,2를 만족하는) 하는 메소드 : createRandArr

		*/
		
		int min = 1, max=45;
		int [] arr = new int[7];  //당첨번호
		int [] arr2 = new int[6];
		if(createRandArr(min,max,arr)){
			printArr(arr);
		}
		else{
			System.out.println("배열 생성에 실패");
		}
		
		
		if(createRandArr(min,max,arr2)){
			printArr(arr2);
		}
		else{
			System.out.println("배열 생성에 실패");
		}
	}

	
// 편하게 쓰고 코드를 단순화 하기 위해 랜덤 메소드를 만듬
	public static int random(int min,int max){
	 	return (int)(Math.random()*(max-min+1)+min);}
	
// 
	public static boolean contain(int [] arr,int num){
		for (int tmp : arr){  //arr값을 tmp에 임시로 저장한다
		if(tmp == num){  //임시로 저장된 tmp 값이 num 과 같다면
			return true; //참값  
		}
				}
		return false;
		}
	
	
	
	public static boolean createRandArr(int [] arr,int min,int max){
		if(arr == null)				{	return false;	}
		if (max-min+1 < arr.length) {   return false; 	}
		int cnt = 0;
		while (cnt < arr.length) {
			int r = random(min,max);
			
			if(!contain(arr, r, cnt)){
				arr[cnt] = r;
				cnt++;
			}
		}

		
		
		public static void printArr(int [] arr){
			System.out.println("[");
			for(int tmp:arr){
				System.out.println(tmp + " ");
			}
			System.out.println("}\n");
			
			}
		
}
	
	
}

