package day07;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int [] arr = new int [3];
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		
		
		for(int tmp : arr)
			System.out.print(tmp + " ");
		System.out.println();
		
		
		//방법2
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		
		for(int tmp : arr)
			System.out.print(tmp + " ");
		System.out.println();
		
		
		//방법3
		for(int i = 0; i<arr.length; i++){
		arr[i] = scan.nextInt();
		}
		for(int tmp : arr){
			System.out.print(tmp + " ");
		
		}
		System.out.println();
		scan.close();
		
	}

}
//콘솔창에 입력을 3번 한다. 그후 엔터치고 다시 3번. 그후 엔터치고 3번
