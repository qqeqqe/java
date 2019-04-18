package day18;

public class UniversityStudent{
	
	Gender gender;
	Major major;
	Grade grade;
	String name;
	Integer id;
	String UniversityStudent;
	double average;
	
	
	
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public Grade getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public String getUniversityStudent() {
		return UniversityStudent;
	}
	public double getAverage() {
		return average;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUniversityStudent(String universityStudent) {
		UniversityStudent = universityStudent;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	public UniversityStudent(){  //기본생성자
		gende = Gender.MALE;
		grade = Grade.FRESHMAN;
		major = Major.NONE;
	}

	
	
	//복사 생성자 . 학생 이름을 일일이 정하기 힘드므로 
	public UniversityStudent(Gender gender, Grade grede, Major major, String name, Integer id){
		this.gender = gender;
		this.grade = grede;
		this.major = major;
		this.name = name;
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		return "대학생 [과=" + major + ", 이름=" + name + ", 학번=" + id + ", 대학="
				+ UniversityStudent + ", 나이=" + average + "]";
	}
	
	
	
}	


	
			
	
		

		
		
			
			
		
		/*
		 학년에는 열거형으로 학년을 설정한다(1~5)
		성별도 열거형으로 설정(남성, 여성)
		학과도 열거형으로 설정

		학번,평점,학교이름은 자유롭게
		*/
		
		