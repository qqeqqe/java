package day7;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int i =0;
		
		for(i=1; i<=50; i++){
			if(50 % i == 0 ) {
				System.out.print(i + " ");	
			}
			}*/
		
		int num =0;
		int cnt,i;
		for(num=1; num<=50; num++){
			for(i=1, cnt=0; i<=num ; i++ ) {
				if(num % i ==0 )
					System.out.print(i + " ");
		
	}
		}
	}
}

