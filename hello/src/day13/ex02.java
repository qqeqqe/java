package day13;

public class ex02 {

	public static void main(String[] args) {
		// 1.다음 배열의 모든값을 출력하는 코드를 작성하세요
	int arr[ ] = new int[]{1,3,5,7,9,2,4,6,8};
	   							/*2 4 6 8 */
	   	
	for(int i=0; i<arr.length ; i++){
			System.out.print(arr[i]+" " );
			
	}
	System.out.println();
		
		
		
		/*
		1. 배열이나 컬렉션 프레임워크 일때 사용
		2. 배열의 값을 확인할때 사용
		3. 배열의 값을 수정할때는 사용하지 않는다
		4. 모든배열을 확인하면서 번지를 신경 안쓸때
		
		*/
		for(int tmp : arr){
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		
		
		
		
		
		//2. 위의 배열에서 짝수번지에 있는 값을 출력하세요
		for (int k=0; k<=arr.length ; k+=2){  
			//여기서 포인트는 k+=2 다 
			// 이 말은 k<=arr.length 풀어서 이야기하면 k는 배열의 끝을 기준으로 k+=2 짝수번지에 접근한다는 것이다.
			//만약 3 6 9 번째에 접근 하고 싶다면 k+=3이라고 하면 된다.
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		
		
	
		//3. 위의 배열에서 가장 큰수를 출력하세요
		/*향상된 포문을 이용하여 모둔 배열을 확인한다*/
		
		
		
		int max = arr[0];
			for(int tmp : arr){ //배열의 모든값을 int tmp에 저장한다
				if(max < tmp){ //0번지부터 tmp의 값
					max = tmp;
				}
			}
		
		System.out.println("최대값은  = " + max);
		
		
		
		
		
		
		
	}	
}



