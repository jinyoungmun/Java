package study1208;

public class Television implements RemoteControl, Searchable{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
		this.volume = RemoteControl.MAX_VOLUME;
	}
	else if(volume > RemoteControl.MIN_VOLUME){
		this.volume = RemoteControl.MIN_VOLUME;
	}
	else {
		this.volume = volume;
	}
	System.out.println("현재 SmartTV 볼륨 크기 : " + this.volume);

}

@Override
public void search(String url){
	System.out.println(url+"을 검색합니다.");
}

}
