package day나의연습장;

public class Exam연습1 {

	public static void main(String[] args) {

		int a = 0, b = 0,i=0;
		
		for (i=1; i <=7; i++) {
			for(b=1 ;b<=7-i ; b++){
				System.out.print(" ");
			}
			
			for(a=1 ;a<=i*2-1 ;a++ ){
			System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		for(i=0 ; i<=6 ; i++){
			for(b=0 ;b<=i ;b++ ){
				System.out.print(" ");
			}
			
			for(a=1 ;a<=(11-i*2) ;a++ ){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
	}
}