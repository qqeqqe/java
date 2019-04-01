package day5;

public class ex11버블정렬방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//버블 정렬 : 단순하고 효율이 가장 안좋다
		// 반복 횟수를 배열의 크기 - 1
		
		int [] arr = new int[]{1,3,5,7,9,2,4,6,8};
		for(int i = 0 ;i<arr.length-1 ; i++ ){ 
			
			for(int j=0 ; j<arr.length-1; j++ ){
			if(arr[j] > arr[j+1]){ //오름차순일때 기호를 > 로 한다
				
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
		}
		}
		}
		
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
