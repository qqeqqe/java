package day5;

public class ex08abcde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*char []pw = new char[8];
		for(int i =0; i<pw.length; i++){
			int r = (int)(Math.random()*62);
			if(r<=9){ 
				pw[i] = (char)('0'+r);
		}else if(r<=35){
			pw[i]=(char)('a'+(r-10));
		}else{
			pw[i]=(char)('A'+(r-36));
			}
			
		}
			System.out.println(pw);*/
			
		int numA = 'a';
		int numB = 'b';
		System.out.println(numA);
		//문자 a에 대한 유니코드 정수값 : 97
		System.out.println(numB);
		//문자 b에 대한 유니코드 정수값 : 98
		
		int numC = 'A';
		int numD = 'B';
		System.out.println(numC);
		//문자 A에 대한 유니코드 정수값 : 65
		System.out.println(numD);
		//문자 B에 대한 유니코드 정수값 : 66
		
		
		int num = 100;
		//97이 a라는 유니코드를 이용하여 a~z까지 출력하는 예제
		for(int i=97; i<=97+25; i++){
			System.out.print((char)i);	
		}
		
		System.out.println();
		for(int i='a'; i<='z'; i++){
			System.out.print((char)i);
		}
		
		System.out.println();
		for(int i=0; i<=25; i++){
			System.out.print((char)('a'+i));
		}
		
		
		
		
	}
}
