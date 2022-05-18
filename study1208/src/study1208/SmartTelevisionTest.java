package study1208;

public class SmartTelevisionTest {

	public static void main(String[] args) {

		RemoteControl rc = new SmartTelevision();
		
		Searchable sr = new SmartTelevision();
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(1);
		sr.search("https://www.daum.net/");
		rc.turnOff();
	}

}
