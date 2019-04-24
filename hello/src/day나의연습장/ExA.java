package day나의연습장;

public class ExA {
	private String name; //이름
	private String id;  //학번
	private String Sname; // 학교명
	private String major; //학과
	double avr;  //평점
	
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getSname() {
		return Sname;
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
	public void setId(String id) {
		this.id = id;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAvr(double avr) {
	if ( avr > 0 && 4.5 < avr);
		this.avr = avr;
	}
	
	
	public ExA(){
		this("","","","",0.0);
	}
	
	
	public ExA(String name,String id,String Sname, String major,double avr ){
		this.name = name;
		this.id = id;
		this.Sname = Sname;
		this.major = major;
		this.avr = avr;
	}
	
	
	public ExA(ExA e){
		this(e.name, e.id, e.Sname, e.major, e.avr);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "ExA [name=" + name + ", id=" + id + ", Sname=" + Sname + ", major=" + major + ", avr=" + avr + "]";
	}
	
	
	
	
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
		ExA other = (ExA) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
