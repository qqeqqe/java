package day10;

import day09.Car;

public class ex01 {

	public class KiaCar extends Car{
	public final static String brand = "KIA";
	public KiaCar(){
		setSpeed (0);
		// spped = 1; 접근 불가 = > 접근 제한자가 private이기 때문에
		//speed = 1; 
				
	}
	}
}
