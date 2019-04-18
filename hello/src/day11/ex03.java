package day11;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1, num2=0;
		int res;
		/*int arr[] = new int[10];*/
		
		
		
		try{// 예외 상황이 발생할수 있는 코드
			
			/*arr[10] = 0;*/
			res = num1/num2;
			System.out.println(res);
			
			//try 문에서 ArithmeticException이 발생하면 아래 catch문을 실행하고 다음코드를 실행해라
			} catch(ArithmeticException e){
				System.out.println("연산예외 발생1!!");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch (ArrayIndexOutOfBoundsException ae){
				System.out.println("연산예외 발생2!!");
			}catch(Exception s){
				System.out.println("예외발생!!!");
			}
		
		
		System.out.println("프로그램 종료!!");
	}

}
