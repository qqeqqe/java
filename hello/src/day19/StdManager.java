package day19;

import java.util.*;

public class StdManager {
	/* 
	 매니저는 학생정보들을 관리하기 위한 저장공간이 필요하다
	 쉽게 정보들을 관리하기 위해 컬렉션 프레임웍이 필요하다
	그런데 학생정보들은 중복되면 안되기 때문에 Set을 이용해야 한다.
	list를 이용할 경우 중복 처리를 해줘야 하는 번거로움이 있다.
	
	핵생정보는 기능을 통해 접근 해야지 외부에서 직접 접근하며 안되기 때문에
	접근 제한자를 private으로 한다.
	*/
	private HashSet<Std> list = new HashSet<Std>();
		//set은 특별히 사이즈가 정해져있지않기 때문에 학생의 정보만 입력해주면 알아서 사이즈를 조절 or 정해준다
		//호출방법은 list.size()
	
	
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	/* 기능 : 학생 정보가 주어지면 해당 학생 정보를 list에서 중복되지 않으면 추가하고 아니면 추가하지 않으며 추가했을 경우 성공을,
	 * 		추가하지 못하면 실패를 알려주는 기능
	 * 매개변수 : 학생정보 => Std s
	 * 리턴타입 : boolean
	 * 메소드명 : insert    	*/
	public boolean insert(Std s){
		//매개변수 s를 그대로 넣으면 list와 외부에서 s를 같이 쓴다.
		//s를 복사생성자를 이용하여 s의 값과 동일한 값을 가지는 tmp 객체를 하나 만든후 해당 tmp를 리스트에 추가한다.
		
		Std tmp = new Std(s);
		
		return list.add(tmp);
	  /*add()라는 메소드는 list에 tmp와 일치하는 정보가 없으면 해당객체를 추가하고 true를 리턴하며 tmp에 일치하는 정보가
	   *있으면 추가하지 않고 false를 리턴한다.	
	   *이 기능은 set 기능에 정해져 있다고 한다
	   */
	}

	
	
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	/* 기능 : 학생정보가 주어지면 list에서 학생정보와 일치하는 학생이 있으면 해당 학생 정보를 반환하는 기능
	 * 매개변수 : 학생정보 Std s 
	 * 리턴타입 : 학생정보 Std
	 * 메소드명 : search
	    	*/
	public Std search(Std s){
	Iterator<Std> it = list.iterator();  //Iterator은 컬렉션에 저장된 각요소에 접근하는 기능을 가졌다.
	while(it.hasNext()){
		Std tmp = (Std)it.next();
		//set기능또한 컬렉션 인터페이스의 자손이므로 Iterator의 기능을 사용할수 있고
		// 주로 while 반복문을 통해 컨렉션 클래스의 요소들을 읽어올수 있다.
		
		
		if (tmp.equals(s))   // list에서 꺼낸 tmp와  s를 같은지를 equals를 이용하여 비교한후 같으면 꺼낸 tmp를 반환
			return tmp;
	}
		
		return null;
		//반복문이 종료될때까지 return이 안된것은 해당정보와 일치하는 객체가 list에 없는경우이기 때문에 null값을 리턴
	}
	
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	/* 기능 : 학생정보가 주어지면 list에서 해당학생의 정보를 삭제하는데 일치하는 학생정보가 없으면 실패를, 있으면 삭제를 해서 성공을 알려주는 기능
	 * 매개변수 : 학생정보 =>Std s
	 * 리턴타입 : boolean 
	 * 메소드명 : delete        */ 
	 public boolean delete(Std s){
		Std tmp1 = search(s);
		 //서치를 통해 검색 되었을때 일치하는 정보가 있으면 tmp값에 넣는다, 객체 정보를 없으면 null을 전달한다.
		 //remove는 tmp라는 객체와 일치하는 정보가 있으면 해당정보를 삭제후 true의 값을 리턴하고, 없으면 false값을 리턴한다.
		 
		 
		 return list.remove(tmp1); // tmp에 저장된 학생정보 "값"을 list에서 지운다.
	 }
	
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	 /* 기      능 : 학생정보가 주어지면 기능 학생 정보를 수정하고 수정여부를 알려주는 기능
	  * 매개변수 : 학생정보  => Std s 
	  * 리턴타입 : 수정여부 boolean
	  * 메소드명 : update        */
	 public boolean update(Std s){
		 // set에서 수정을 하려면 기존에 있는 객체를 삭제후 수정된 객체 정보를 추가해야한다.
		 // 
		 
		 if(!delete(s)){   //if 만약 삭제를 못하면 false; 
		  return false;
		  }
		 
		 
		 return insert(s); // 만약 true면 (s에 담긴 학생정보를) list에 추가한다.
		  }
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	/*기      능 : "전체" 학생정보를 출력하는 기능
	 *매개변수 : 없다
	 *리턴타입 : 없다 = void
	 *메소드명 : print
	*/

	public void print(){
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();  // 셋을 쓰려면 Iterator써야 하기 때문에 이 외워둬야함
			
			System.out.println(tmp);
		
		}
	}
	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	public void printMenu(){
		System.out.println("----------메뉴----------");
		System.out.println("1학생정보추가");
		System.out.println("2학생정보수정");
		System.out.println("3학생정보삭제");
		System.out.println("4학생정보출력");
		System.out.println("5종료");
		System.out.println("-----------------------");
		System.out.println("메뉴를 입력해 주세요");
	}
	
	
	
	
	/* 기능 : Scanner 가 주어지면 Scanner를 통해 학생 학번을 입력받아 학생 객체로 돌려주는 기능
	 매개변수 : Scanner scan
	 리턴타입 : 학생객체 Std
	 메소드명 : inputId
	 */	
	
	public Std inputId(Scanner scan){
		System.out.println("-------정보를 입력하세요------");
		System.out.println("학번 : ");
		
		Std tmp = new Std();
		
		String id = scan.next().trim(); 
		tmp.setId(id); // tmp 객체에 (id) 정보를 setId 양식에 마춪다
		
				
		return tmp;
	}
	
	
	
	
	public Std inputStd(Scanner scan){
		Std tmp = inputId(scan);
		
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("학교명 : ");
		String sName = scan.next();
		
		System.out.println("전공 : ");
		String major = scan.next();
		
		System.out.println("평점 : ");
		double avr  = scan.nextDouble();
		
		System.out.println("------------------------");

		tmp.setName(name);  // 입력받은 정보를 다른 파일 Std 파일의 set필터링에 입력한다.
		tmp.setSname(sName); // 학생정보에 링크를 걸어버림 // 포인트 핵심
		tmp.setMajor(major);
		tmp.setAvr(avr);
		return tmp;
	}


}