package day02;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0;
		for (i = 1,sum=0 ; i <=4 ; i++, sum++){
			sum = i + sum; 
		}
			System.out.println("1부터 10까지의 합:"+sum);
	}

}
/*
1 0 
2 0 
3 0
4 0
*/
 