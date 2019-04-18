package day07;

import java.util.Arrays;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2.5개짜리 배열을 생성하고 배열에 0번지에 5, 1번지에4, 2번지에3, 3번지에2, 4번지에1를 저장하고
		출력하는 코드를 작성하세여*/
		
		
		
		int [] arr2 = new int[]{5,4,3,2,1};
		System.out.println(Arrays.toString(arr2));
				
		System.out.println();
		int [] arr = new int[5];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 1;
		
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");
		System.out.print(arr[3] + " ");
		System.out.print(arr[4] + " ");
		System.out.println();
		
		int [] arr3 = new int [3];
		int sum=0;
		for(int i=0; i<arr.length ; i++){
			sum = arr3[3]-i;
			System.out.print(sum);
		}
	}

}
