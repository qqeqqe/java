package day8;

public class ex07오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMultiTables();
		}
	
	
	
	
	
	public static int printMul(int num1, int num2){
		System.out.println(num1 + "x" + num2 + " = " + num1*num2);
		return num1*num2;
		}
	
	/*기능 - 단이 주어지면 해당하는 단을 출력하는 메소드
	매개변수 - 단=>int num
	리턴타입 - 없다 = void
	메소드명 -  printDan*/
	
	public static void printDan(int num){
		for (int i =1 ; i<=9 ; i++){
			printMul(num,i);
	}
	}
		
	/*기능 - start 단에서 end단까지 출력하는 메서드
	매개변수 -int start, int end
	리턴타입 -void
	메소드명 -printAll	*/
		
	public static void printMultiTables(int start, int end){
		if(start < 0 ) return; //리턴 타입이 void 일때 미 메소드를 강제 종료 하고 싶을때
		for(int i=start; i<=end; i++){
			printDan(i);
		}
	}
			
	
		public static void printMultiTables(){
			printMultiTables(3,9);
			 
			
		}
	
	}


