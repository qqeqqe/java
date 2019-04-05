package day나의예제;

public class washer {

	
	/*
	클래스 객체를 washer 라 칭하고
	
	세탁기 = washer
	
	
	세탁기 속도 조절 + washerSppedUp
	세탁기 속도 조절 - washerSppedDown
	
	세재 = seaweed
	
	세제량 조절 + seaweedAmountUp
	세재량 조절 - seaweedAmountDown 
	
	
	*/
	
	private int washerS; //세탁기 속도
	private int seaweedA; //세재 량
	private final int MAX_washerSpped = 10;
	private final int MAX_seaweedAmount = 50;	
	
	
	public void washerSeedUp(){
		if( washerS < MAX_washerSpped )
			washerS ++;
	}
	
	
	public void washerSeedDown(){
		if( washerS < MAX_washerSpped )
			washerS --;
	}
	
	 
	
	
}

