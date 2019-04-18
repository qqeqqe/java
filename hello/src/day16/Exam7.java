package day16;

import java.util.*;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet(); // 
		
		set.add("abc");  //객체를 넣는 이유는 해당하는 객체의 이퀄스를 사용하기 위해서
		set.add("abc");  //객체를 넣는 이유는 해당하는 객체의 이퀄스를 사용하기 위해서
		set.add(new Person("David",10));
		//객체 생성을 하였기 때문에 아래 메소드에 있는 소스를 참조, 만약 아래 메소드에 컬렉션프레임웍 set이있다면 중복된 값을 제거할것이다.
		set.add(new Person("David",10));
		
		System.out.println(set);
	}

	/*동일한 값을 가지는 Person 클래스의 객체를 여러개 만들어서 추가하면 Person 클래스에 오버라이딩된 equals()와
	hashCode()를 찾는데 없으면 Object클래스에 있는 equals()와 hashCode()를 찾아 사용한다
	이때 Object 클래스의 equals()는 주소값이 같아야 같은 객체로 판별하므로 아래 예제처럼 값이 같은 두 객체라도
	다른객체로 판별해서 set에 각각 저장한다*/
	
}

class Person{
	String name;
	int age;
	
	Person( String name, int age){
		this.name=name;
		this.age=age;
		}

	@Override
	public String toString() {
		return name +":"+ age;
	}

	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}