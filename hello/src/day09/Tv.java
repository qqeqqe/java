package day09;

public class Tv {

	//일반 멤버 변수, 객체 멤버 변수
	
	
	private int channel;
	private int volumn;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUMN = 100;
	//일반 멤버 메서드, 객채 멤버 메서드
	public void channelUp(){
		if (channel < MAX_CHANNEL)
		channel++;
	}
	
	public void channelDown(){
		if (channel > 0)
		channel--;
	}
	
	public void setChannel(int ch){ // 채널을 리모컨 버튼으로 직접 입력 하는 경우
		if ( ch == 0 )
			channel = 1;
		else if(ch > MAX_CHANNEL)
			channel = MAX_CHANNEL;
		else
			channel = ch;
	}
	
	

//클래스 멤버 변수
	public static final String BRAND = "삼성";
	
	
	
	public void volumnUp(){
		if (volumn < MAX_VOLUMN)
		volumn++;
	}
	
	public void volumnDown(){
		if (volumn > 0)
		volumn--;
	}
	
	public void printVolumn(){
		System.out.println("현재 소리 크기 : " + volumn);
	}
	public void printChannel(){
		System.out.println("현재 채널 번호 : " + channel);
	}
	
	
	//생성자가 아예 없을때 기본 생성자가 컴파일러에 의해 자동으로 추가된다.
	//기본 생성자 없이 다른 생성자를 만들고 기본 생성자를 호출하면 에러가 난다.
	public Tv() {  
		this(1,10);  
		
		}
	
	
	public Tv(int channel, int volumn){
		setChannel(channel);
		if(volumn > MAX_VOLUMN)
			this.volumn = MAX_VOLUMN; //여기서 this는 이 Tv클래스안에서만 지정하는것
		else
			this.volumn = volumn;   //여기서 this는 이 Tv클래스안에서만 지정하는것
	}
	
	
	public Tv(Tv stv){   //복사 생성자라고도 불린다. 다른객체를 복사하여 쓰기 때문에
		this(stv.channel, stv.volumn);
		/*channel = stv.channel;
		volumn = stv.volumn;*/
	}
}//클래스의끝
