package day5;

public class ex07password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a~z,A~Z 0~9로 조합된 8자리의 임시 비밀번호 발급하는 예제
/*		a~z : 26개
		A~Z : 26개
		0~9 : 10개
		총 범위가 62개, 0부터니깐 총 61개를 포함
		0~9 : '0'~'9'
		10~35까지는 : 'a'~'z'
		36~61까지는 : 'A'~'Z'
		랜덤한 수가 60이면 = 'Y'와 같다
		
		*/
		
		char []pw = new char[8];
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
			System.out.println(pw);
		}
	}

