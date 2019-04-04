package day7;

public class ex05에러의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*int num;
	System.out.println(num);*/
		//에러발생 : The local variable num may not have been initialized
		//num값을 초기화 하시오
		
		
	/*System.out.println(num2);*/
		//에러원인 : num2 cannot be resolved to a variable
		//변수를 선언하지 않고 사용하는 경우
	
	
	/*int num3 = 1/0; */
		//에러 내용 : java.lang.Error: Unresolved compilation problem: 
		//어떤수를 0으로 나누었을때 나오는 메세지
		
		
	/*int []arr = new int[5];
	arr[5]=1;*/
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//배열은 유효하지 않는 번지로 접근하는 경우
	
	
//	for (int i = 0; i < 5; i++) {
		//Syntax error, insert "}" to complete ClassBody
		// } 가 없기 때문에 에러가 났음
		
		
	}

}
