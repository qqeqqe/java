package day06;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class ex7로또번호 {

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
		// 당첨 번호가 7.8.9.10.11.12
		
		
		int min = 1, max=10;
		int [] arr = new int[7];  //당첨번호의 보너스 번호
		int [] arr2 = new int[6]; //
		
		
		
		
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
		
		
		
		
		//당첨 등수를 출력하는 코드를 작성하시오
		//1등 : 보너스 번호를 제외한 번호 6개가 일치 
		//2등 : 보너스 번호를 포함한 번호 6개가 일치
		//3등 : 보너스 번호를 제외한 번호 5개가 일치
		//4등 : 보너스 번호를 제외한 번호 4개가 일치
		//5등 : 보너스 번호를 제외한 번호 3개가 일치
		//꽝 : 2개 이하
			
	int r = rank(arr,arr2);
	printRank(r);
	
	} // 메인의 끝
	

	
	
	/*
	기능 - 두배열이 주어지면 두 배열에 같은 원소가 몇개 있는지 알려주는 메소드
	매개변수 - 두 배열 = > int []arr1, int []arr2 
	리턴타입 - 갯수 = int
	메소드명 - compareArr*/
	
	public static int compareArr(int []arr1, int []arr2){
		int cnt = 0;   // 두 배열의 원소중 일치하는 숫자 갯수
		int size = 0;  // arr1과 arr2의 길이가 틀리기 때문에 사이즈를 선언한다
		
		if(arr1.length > arr2.length){
			size = arr1.length;
		}else{
			size = arr1.length;
		}
		
		//두 배열에서 일치하는 원소의 갯수를 구하는 과정
		for(int i = 0; i<size; i++){
				if (contain(arr2,arr1[i],size)){  //컨테인은 포함하다라는 뜻
					cnt ++;
				}}return cnt;
		}
	
	
	
	/*기능 - 당첨배열과 자동생성배열이 주어지면 몇등인지 알려주는 메소드(단 꽝은 -1)
	매개변수 - 두 배열=>int[]lotto,int[]auto 
	리턴타입 - 등수 = int
	메소드명 - rank*/
public static int rank(int []lotto, int []auto){  //콘솔출력창에 1줄과 2줄에 같은값이 있는지 비교하는 메서드
		int cnt = compareArr(lotto,auto); 
		switch(cnt){
		case 6: return 1; //
		case 5: 
			if(contain(auto,lotto[lotto.length-1],auto.length)) return 2;
			else return 3;
			
		case 4: return 4;
		case 3: return 5;
		default:return -1;
		
		}
	}

	
public static void printRank(int r){
		if(r == -1){
			System.out.println("꽝");
		}else{
			System.out.println(r+"등");
		}
	}
	
	
	
	
// 편하게 쓰고 코드를 단순화 하기 위해 랜덤 메소드를 만듬
public static int random(int min,int max){
	 	return (int)(Math.random()*(max-min+1)+min);}
	
// 
public static boolean contain(int [] arr,int num,int cnt){ //컨테인은 내가 찾는 수가 있는지 본다
		for (int tmp : arr){  //arr값을 tmp에 임시로 저장한다
		if(tmp == num){  //임시로 저장된 tmp 값이 num 과 같다면
		return true; //참값  
		}
				}
		return false;
		}
	
	
	
	
	
	
public static boolean createRandArr(int min,int max,int [] arr){
		//매개 변수로 넘어온 배열이 생성되어 있지 않을때
		if(arr == null)				{	return false;	}

		//생성할수 있는 수자의 갯수보다 배열의 크기가 클때
		//중복되는 상황이 발생할 수밖에 없을때
		if (max-min+1 < arr.length) {   return false; 	}
		
		int cnt = 0; //배열에 저장된 랜덤한 숫자의 갯수
		
		
		while (cnt < arr.length) {
			int r = random(min,max); //랜덤 메서드를 끌어온것이다
			
			if(!contain(arr, r, cnt)){ //배열에 숫자가 포함되지 않는다면 
				arr[cnt] = r; //랜덤한 값을 배열 cnt에 저장하고
				cnt++; //다음 cnt 칸으로 넘어가라
			}
		}
		return true; 
	}
		

		
public static void printArr(int [] arr){
			System.out.print("{");
			for(int tmp:arr){
				System.out.print(tmp + " ");
			}
			System.out.print("}\n");
			
			}
		
}
	
	


