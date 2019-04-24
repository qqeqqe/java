package day19;

public class Std {

	private String name="";;  //이름
	private String Sname="";  //학교이름
	private String id="";     //학번
	private String major="";  //학과    //스트링은 초기값이 null(없다) 그래서 "" 표시를 해서 초기화를 해준다
	private double avr;		  //평점
	

	
	
	public String getName() {
		return name;
	}
	public String getSname() {
		return Sname;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAvr() {
		return avr;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAvr(double avr) {
		
		if(avr > 4.5 || avr < 0)
			return; //없다
		//평점이 0에서 4.5사이 이기 때문에 범위를 범어나는 점수가 들어온다면 저장하지 않는다.
		
		this.avr = avr;
	}
	
	
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//학생 정보를 객체를 이용하여 출력할때 보고싶은 내용으로 출력하기 위해 오버라이딩함	
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 학교이름=" + Sname + ", 학번=" + id + ", 전공=" + major + ", 평점=" + avr + "]";
	}
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	//5. 기본생성자는 생성자가 하나도 없으면 자동으로 생성되지만
	//   다른 생성자가 있으면 자동으로 생성되지 않는다.
	// 사실 이 클래스에서 기본 생성자에서 할일은 없다.
	// => 명시적 초기화에서 다 했기 때문에
	// 다른 생성자를 만들거고 혹시나 기본 생성자를 이용해서 객체를 만들 상황이 있을수도 있기때문에 간단히 만들어줬다.
	
	public Std(){
		
	}
	
	
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	//복사 생성자 : 생성자 오버로딩
	//this (나) this.name 는 이 클래스의 네임은 std 메소드의 name 이란 의미
	public Std(String name, String id,String sName, String major, double avr){
		this.name = name;
		this.id = id;
		this.Sname = sName;
		this.major = major;
		this.avr = avr;
	}

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	//6. 복사 생성자 : 매개변수가 같은 클래스의 객체가 넘어오는 경우
	// 오버로딩 : 한 클래스 내에서 동일한 이름을 가지는 메서드(생성자)가 여러개 존재하는 경우
	// 조건 - 매개변수의 갯수가 다르다. 자료형이 다르다.
	// 중요한것 - 1클래스명과 동일하다. 2리턴타입이 없다. 다른 파일에서 마음대로 호출할수 없고 객체가 생성될때 호출된다.
	//ex) Std s = new Std();  new 라는 객체를 생성후 불러오면 된다. 
		public Std(Std s){
			
			this(s.name, s.id, s.Sname, s.major, s.avr);	
		}
		
		
		
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	// 4 번째 작업
	//마우스 우클릭 - 소스 - 해시코드 이퀄스 - 체크 모두 삭제 하고 - id만 체크한후 생성
	//이 기능은 후에 검색을 통해 id가 같으면 그 학생의 정보를 쓰기 위해서다

	//hashCode()와 equls()는 항상 세트로 오버라이딩을 해야함
	//같다는 것을 판펼하기 위한 정보들이 있는데 이 정보들이 같은데
	//다른 그룹이면 다른 객체로 판펼하게 된다. 따라서 같은 객체로 판펼하기 위해서는 같은 저보를 가지면 같은 그룹에 있게 해야한다
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	// 1.멤버변수
	// 2.멤버변수에 대한 getter setter
	// 3.오버라이딩
	
	// 4.학생메니져에서 set을 이용하여 학생정보를 관리하는데 set은 중복을 허용하지 않고 중복 확인을 hashCode와 equals를 이용하여 검사
	//하는데 기본적으로 구현되어 있지 않으면 부모것을 가져오기 때문에 id를 이용하여 같은지 다를지를 판펼하기 위해 오버라이딩

}//메인의 끝