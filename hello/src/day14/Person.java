package day14;

public class Person {

	//1
	private String name;  //이름
	private int age;  //나이
	private String birthDay; //생일
	private String gender;  //성별
	private String address;  
	private String nationality;
	
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		if(age >= 0 );
		return age;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getNationality() {
		return nationality;
	}
	
	
	
	//2
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirthDay(String birthDay) {
		//스트링은 객체이기때문에 null값이 들어올수 있다. 놀포인트 입센션이 올수 있다
		if(birthDay == null || birthDay.length() !=8)
			return;
		
		String sMonth = birthDay.substring(4,6); // 서브 스트링은 부분 문자열
		//생일은 yyyy mm dd  //서브스티링은 부분 문자열 추출로 4번지와 5번지 추출  마지막은 -1이 된다
		
		Integer month = Integer.parseInt(sMonth);
		//인티저는 클래스 정수형  //문자열 12를 정수 12로 변경  // parseInt는 인티저의 기능. 문자열을 정수로 변경할수 있다
		
		if(month>=1 && month <=12)
		this.birthDay = birthDay;
	}
	
	
	
	public void setGender(String gender) throws Exception {
		if(gender == null)
			throw new Exception("객체가 null 값 입니다.");
				
				
		if(gender != null &&  //젠더가 거짓 그리고 
		  (gender.equals("남성") || gender.equals("여성"))) // 여기서 이퀄스 equals 는 == 의미와 같다
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	
	
	//3 생성자를 만들어 초기값을 설정한다. //7번째 주석처리후 this 추가
	//오버로딩의 일종
	public Person(){
	
		this ("","","","남자","20000101",1);
		/*name=""; gender="남자"; address=""; nationality="";
	age=1; birthDay="20000101";
	setGender("남자");
	setBirthDay("20000101");*/
	}
	
	
	
	
	
	//4 오버로딩 // 복사 생성자를 생서한다  //6번째 주석처리후 중복되는 코드를 정리
	public Person(Person p){
		this(p.name, p.address, p.nationality,
			p.gender, p.birthDay, p.age);
		
		
		/*name=p.name; address=p.address; nationality=p.nationality;
		age=p.age;  
		setGender(p.gender);
		setBirthDay(p.birthDay);*/
	}
	
	
	
	
	//5 오버로딩하여 생성자를 만든다 이유는 하나의 메서드로 만들고 변수의 초기값이나 복사메서드를 만들기 위함
	//생성자는 리턴값이 없다
	//여기서 오버로딩이란 자료형 이름이 다르거나 매개변수의 갯수가 달라야 한다.
	public Person(String name, String address, String nationality,
			String gender, String birthDay, int age){
	this.name=name;  //여기서 this란 (이 클래스의) or (내 클래스) 보통 매개변수와 멤버변수와 혼동을 막기 위해 쓴다.
	this.address=address;
	this.nationality=nationality;
	this.age=age;
	
	try {
		setGender(gender);  // 요놈들은 set의 필터링을 거쳐서 오라는 의미
	} catch (Exception e) {
		this.gender="남자";
	}
	
	setBirthDay(birthDay); // 요놈들은 set의 필터링을 거쳐서 오라는 의미
		
	}
}
