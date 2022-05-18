package study;

public class CellPhone {

	String model;
	String color;
	
	
	void powerOn(){
		System.out.println("스마트폰의 전원을 켭니다.");
	}
	
	void bell(){
		System.out.println("벨이 울립니다.");
	}
	
	void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
	}
	
	void sendVoice(String m){
		System.out.println("나 : "+m);
	}
	
	void recieveVoice(String m) {
		System.out.println("상대방 : " + m);
	}
	
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}
