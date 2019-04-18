package day14;



public class UniversityStudent extends Person{ 
	
	//멤버 변수를 만들고
	/*석사, 학사, 박사*/
	
	private String id;    	//학번
	private String state; 	//학생 상태로 , 재학, 수료, 졸업, 휴학
	private double averaScore; // 학점
	private int semester; //학기
	private String major; //
	private String universityName;  //학교이름
	private String advisor;  // 지도교사
	
	
	//2 겟터 셋터 만들기
	public String getId() {
		return id;
	}
	public String getState() {
		return state;
	}
	public double getAveraScore() {
		return averaScore;
	}
	public int getSemester() {
		return semester;
	}
	public String getMajor() {
		return major;
	}
	public String getUniversityName() {
		return universityName;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public void setState(String state) {
		this.state = state;
	}
	public void setAveraScore(double averaScore) {
		if(averaScore >= 0)
		this.averaScore = averaScore;
	}
	public void setSemester(int semester) {
		if(semester > 0)
		this.semester = semester;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	
	
	
	////////////////// 중간 설명 스트링은 클래스이며 참조변수이다. 그래서 = 를 해도 기존 변수에 영향을 주지 않고 최근에 저장한 변수에만 영향을 준다
	
	
	
	
	//3번째 할게 없다면 기본생성자
	public UniversityStudent(){
		// super(); 써도 되고 안써도 된다...기본생성자이기 때문에 만들어진 상태
		
		setSemester(1);     //셋터를 불러오서 기본 정보를 초기화 한다. 학기가 1학기부터 시작이므로 1학기로 지정한다
		setAveraScore(0.0); // 학점도 기본 0.0으로 하기 때문에 초기화를 0.0으로 한다.
		id=""; advisor=""; state=""; universityName=""; major="";  //셋터로 불러줘도 상관없음
	}
	
	
	
	//4번째 복사생성를 생성한다. //pason 에서 작업후 //2번째 슈퍼를 이용해 부모클래스의 복사메소드 가져온다 
	public	UniversityStudent(UniversityStudent s){
	
	super(s); //부모클래스의 복사메서드를 가져온다
		
	setSemester(s.semester);
	setAveraScore(s.averaScore);
	id=s.id; advisor=s.advisor; state=s.state;
	universityName=s.universityName; major=s.major;
	}
	
	
	//pason 에서 작업후 //1번째로 작업한것
	//객체를 생성한다. 생성후 새로 추가된 변수에 대해서도 객체를 생성한다.
	public UniversityStudent(String name, String address, String nationality,
			String gender, String birthDay, int age, 
			
			int semester, double avergeScore,
			String id, String adbosir, String state, String universityName, String major)
	
	{
		
		//부모생성자 호출하고 추가된 작업을 한다.
		super(name, address, nationality, gender, birthDay, age);
		
		setSemester(semester);
		setAveraScore(avergeScore);
		this.id=id; this.advisor=advisor; this.state=state;
		this.universityName=universityName; this.major=major;
		
	}

	
}
