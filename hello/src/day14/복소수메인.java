package day14;

public class 복소수메인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complexity c1 = new Complexity(1,2);
		Complexity c2 = new Complexity(3,4);
		Complexity c3 = c1.add(c2);
		Complexity c4 = c1.sub(c2);
		System.out.println(c1 + "+" + c2 + "=" + c3);
		System.out.println(c1 + "-" + c2 + "=" + c4);
	}
}


class Complexity{
	private int real;
	private int img;
	
	
	public int getReal() {
		return real;
	}
	public int getImg() {
		return img;
	}
	
	
	public void setReal(int real) {
		this.real = real;
	}
	public void setImg(int img) {
		this.img = img;
	}
	
	

	@Override
public String toString() {

//Exam6에서 작업후 3
		String str="";
		
		if(real !=0)
		str += real;
			
		if(img>1)
			str += "+" + img+ "i";
		else if (img == 1)
			str += "+i";
		
		
		else if(img<0)
			str += img + "i";
		
			if ( real !=0 || img !=0)
		str = "(" + str + ")";
		
			if(real == 0 && img == 0 )
				str = "0";
			
		return str;
		
	}
	
//Exam6에서 작업후 1
	// 생성자를 만든 이유는 일일이 정보값을 입력하기 힘들기 때문에
	public Complexity(int real, int img){
		this.real=real;
		this.img=img;
	}

//Exam6에서 작업후 2
	//오버로딩 // 복사 생성자
	public Complexity(Complexity c){
		this(c.real, c.img);
	}
		
		


//Exam6에서 작업후 4
	
  /*기      능 - 매개변수 복소수와 나를 던한 결과를 복소수 객체로 전달하는 메소드
	매개변수 - 복소수 = Complexity c
	리턴타입 - 더한 결과  = Complexity
	메소드명 - add*/
	public Complexity add(Complexity c){
		/*return new Complexity(real+c.real, img+c.img);*/ //아래 공식이 이 한줄과 같다
		Complexity res = new Complexity(0,0);
		res.real = real + c.real;
		res.img = img + c.img;
		return res;
	}
	
	// 빼기용
	public Complexity sub(Complexity c){
		/*return new Complexity(real+c.real, img+c.img);*/ //아래 공식이 이 한줄과 같다
		Complexity res = new Complexity(0,0);
		res.real = real - c.real;
		res.img = img - c.img;
		return res;
	}
}



	
