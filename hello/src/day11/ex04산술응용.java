package day11;

public class ex04산술응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		System.out.println(calc(1,2,'/'));  // 0으로 나눌시 오류가 발생됨
		}catch(Exception e){
			
			
			// Exception e = new Exception("0으로 나눌수는 없습니다");
			e.printStackTrace();
		}finally {
			System.out.println("예외처리가끝나면 무조건 실행되는곳");
		}
		
		Shape ss = new Shape();
		System.out.println(ss);
		
	}
		
		public static double calc(int num1, int num2, char op) throws Exception{
			
			double res=0.0;
			if (op == '/' && num2 ==0 ){
				
				//throw new Exception("0으로 나눌수는 없습니다")
				Exception e = new Exception("0으로 나눌수 없습니다.");
				throw e;
			}
		
			
			switch(op){
			case '+': res = num1+num2; break;
			case '-': res = num1+num2; break;
			case '*': res = num1+num2; break;
			case '/': res = (double)num1+num2; break;
			case '%': res = num1+num2; break;
			}
			return res;
		}
		} 
