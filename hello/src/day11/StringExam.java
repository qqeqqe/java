package day11;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 스트링 예제문
		
		String str1 = "hello", str2="hello";
			boolean cmp ="hello" == "hello";
					System.out.println(cmp);
			
			cmp = str1 != (str2="hello ");  // 가로안에 있는거와 str1이 같지 않다면 true
			System.out.println(cmp);
			
			cmp = str1 != (str2="hello 1");  // 
			System.out.println(cmp);
			
			
			System.out.println(str1.equals(str2));
			
	}

}
