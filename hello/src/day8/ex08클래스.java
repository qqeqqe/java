package day8;

public class ex08클래스 {

	public static void main(String[] args) {

		Tv t = null;
		t = new Tv(); // tv() 라는 생성자를 호출해서 객체를 생성
		t.volumnDown(); 
		t.printVolumn();
		
		t = new Tv();
		t.printVolumn();
		
	
		
		
		
	}
}

	class Tv{
		
	private int channel;
	private final int MAX_CHANNEL = 100;
		
	public void channelup(){ 	 // 하나 올리는 메서드
			if (MAX_CHANNEL > channel) 
				channel++;	
			}
	
	public void channelDown(){ 	// 하나 내리는 메서드
			if(channel > 0 )
				channel --;
			}
	
	public void setChannel(int ch){ 
		channel = ch;
		}

	
	
		
	private int volumn;
	private final int MAX_VOLUMN = 100;
		
		
	public void volumnUp(){  //소리를 올리는 메서드	
		if (MAX_VOLUMN > volumn) 
			volumn++;	
		}
	
	public void volumnDown(){ //소리를 내리는 메서드	
		if(volumn > 0 )
			volumn --;
		}
	
	public void printVolumn(){
	System.out.println(volumn);
	}
}
	
	
	
	
