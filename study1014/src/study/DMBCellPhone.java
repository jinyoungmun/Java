package study;

public class DMBCellPhone extends CellPhone {

	int channel;
	
	DMBCellPhone(String m, String c, int ch){
		model = m;
		color = c;
		channel = ch;
	}
	
	void turnOn(){
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannel(int ch){
		channel = ch;
		System.out.println("채널"+ch+"번으로 바꿉니다.");
	}
	
	void turnOff() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	
}

