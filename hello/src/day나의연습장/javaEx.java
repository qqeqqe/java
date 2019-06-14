package day나의연습장;


	class addCalu{
			int a;
			int b;
			
		
			public addCalu(){}
			
			
			public addCalu(addCalu c){
				this(c.a , c.b);     // c안에 클래스의 a b 값을 집어 넣는다, 그래야 호출하기 편하기 때문
			}
			
			public addCalu(int a, int b){
				this.a = a;
				this.b = b;  // 다른클래스에서 호출하기 위해 압축?
			}
			
			

		
			
			
			
}
		
		
		
		
