package day나의연습장;

import java.util.HashSet;
import java.util.Iterator;

import day19.Std;

public class ExB {

	private HashSet<ExA> listB = new HashSet<ExA>();

	
		
	// 학생정보 추가
	public boolean insert(ExA e){
		ExA tmp = new ExA(e);
		return listB.add(tmp);
		}
	

	//학생정보 검색
	public ExA search(ExA e){
	Iterator<ExA> it = listB.iterator();
	while(it.hasNext()){
	ExA tmp = (ExA)it.next();
	
	return tmp;
	}
	return null;
	}

	
	
	public boolean delete(ExA e){
		ExA tmp = search(e);
		
		return listB.remove(e);
	}


	
	public boolean update(ExA e){
		if(!delete(e)){
		return false;
		}
		return insert(e);
	}

	
	
	public void print (){
		Iterator<ExA> it = listB.iterator();
		while(it.hasNext()){
			ExA tmp = (ExA)it.next();
			
			System.out.println(tmp);
	}
	}




	

	
	
}