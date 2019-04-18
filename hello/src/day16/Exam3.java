package day16;

import java.util.*;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector(5); //메소드의 일종
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();  //공백을 줄여주는 명령어
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		
		v.ensureCapacity(6); // 공간을 늘리는 명령어
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		
		v.setSize(7); // 사이즈를 7로 늘리로 빈공간을 null=없다로 표시해라 그리고 +5의 용량을 더한다
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
		
	}

	public static void print(Vector v){
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		
	}
}
