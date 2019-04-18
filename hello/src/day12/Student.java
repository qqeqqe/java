package day12;

public class Student{
		private String name;
		private int grade; 
		private int classNum;
		private int num;
		private double kor;
		private double eng;
		private double math;
		
		
		public String getName() {
			return name;
		}
		public int getGrade() {
			return grade;
		}
		public int getClassNum() {
			return classNum;
		}
		public int getNum() {
			return num;
		}
		public double getKor() {
			return kor;
		}
		public double getEng() {
			return eng;
		}
		public double getMath() {
			return math;
		}
		
		
		
		public void setName(String name) {
			this.name = name;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setClassNum(int classNum) {
			this.classNum = classNum;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public void setKor(double kor) {
			if(kor>=0 && kor <= 100)
			this.kor = kor;
		}
		public void setEng(double eng) {
			if(eng>=0 && eng <= 100)
			this.eng = eng;
		}
		public void setMath(double math) {
			if(math>=0 && math <= 100)
			this.math = math;
		}
		
		
		
		
		
		//생성자를 하나도 구현되지 않으면 기본생성자가 자동으로 만들어진다
		public Student(){
			init(); // <--- 매서드 호출
		} 
		
		
		
		// 
		public Student(String name, int grade, int classNum,
				int num, double kor, double eng, double math){ 
			init(name,grade,classNum, num,kor, eng, math);
		}
		
		
		//복사 메서드 // 양식 같은 의미 // 구현화된 양식에서 세부적인 변경이있고 나머지 값이 같다면 이용한다.
		public Student(Student s){  //s의 값에 각 정보를 담아라
			init(s.name, s.grade, s.classNum, s.num, s.kor, 
					s.eng, s.math);
		}


		//아래의 멤버 변수를 초기화 하는 메소드  // 여기서 멤버 변수란 this. 이 들어간것들이다.
		public void init(){ 
			init("",1,1,1,0,0,0); 	// 여기서 쌍 따음표는 new String() 라는 의미와 같다.
			//init(new String(),1,1,1,0,0,0);   
		}
		
		
		//setter의 값을 init의 메서드로 정의한다. 만드는 이유는 학생수 일일이 다 만들기 어렵기 때문에 링크해서 쓸려고...
		public void init(String name, int grade, int classNum, 
				int num, double kor, double eng, double math){ 
		
			this.setName(name); 
			this.setGrade(grade); 
			this.setClassNum(classNum); 
			this.setNum(num); 
			this.setKor(kor); 
			this.setEng(eng); 
			this.setMath(math); 
		} 
		
		@Override 
		public String toString() {
			return "Student [학년=" + grade + ", 반=" + classNum + ", 번호=" + num + ""
					+ ", 이름=" + name + ", " + "국어=" + kor + ", 영어=" + eng + ", 수학=" + math + "]";
		
		}
		
}	


		
	
	

