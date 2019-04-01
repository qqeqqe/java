package day5;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class ex03array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7개의 정수형 배열을 생성하고 0번지에는 0....마지막 6번지에는 6을 넣는 코드를 작성하시오
	
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		int i = 0;
		i = scan.nextInt();*/
		
		int i =0;
		int [] arr = new int[7];
		for (i=0; i<arr.length ; i++){
			arr[i] = i;
					System.out.println(arr[i] + "번지");
		}
		
		
		
	}

}
