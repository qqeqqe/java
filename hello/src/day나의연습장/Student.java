package day나의연습장;

public class Student {

	// 학생 관리 프로그램을 만들어보자.
	
	private String name; //이름
	private int grade; // 학년
	private int classNum; // 학반
	private int number; //번호
	private double kor ;
	private double eng ;
	private double math ;
	
	
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public int getNumber() {
		return number;
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
	public void setNumber(int number) {
		this.number = number;
	}
	public void setKor(double kor) {
		if (kor > 0 && kor < 100)
		this.kor = kor;
	}
	
	public void setEng(double eng) {
		if (eng > 0 && eng < 100)
		this.eng = eng;
	}
	public void setMath(double math) {
		if (math > 0 && math < 100)
		this.math = math;
	}
	
	
	
	
	public void init(){ //아래걸 오버로딩해서 초기화 한다
		init("",1,1,1,0,0,0);
	}
	
	
	public void init(String name, int grade, int classNum,int number,int kor, int eng, int math){
		this.setName(name);
		this.setGrade(grade);
		this.setClassNum(classNum);
		this.setNumber(number);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);

	}
	
	
	
	
	
	 
	
	
}

