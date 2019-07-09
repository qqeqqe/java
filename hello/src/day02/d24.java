package day02	;
	
public class d24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제 a가 2의 배수면 2의 배수라고 출력하는 예제
		
		Drainage a = new Drainage();	
		a.Drain(11);
	
	}
}



class Drainage{
	private int num;
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	 
	}
	

	public Drainage(){}
	//기본 생성자 - 클래스를 만들면 기본 생성자가 만들어진다.
	
	
	/*
	public Drainage(int num){
		Drain(num);
	}
	
	public Drainage(Drainage d){
		Drain(d.num);
	}*/
	
	
	
	public void Drain(int num){
		this.num = num;
		
		
		if (num % 2 == 0){
		System.out.println(num + "는 2의 배수입니다");
		}else{
		System.out.println(num + "는 2의 배수가 아닙니다.");
		}		
	}
}

