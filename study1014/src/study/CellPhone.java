package study;

public class CellPhone {

	String model;
	String color;
	
	
	void powerOn(){
		System.out.println("����Ʈ���� ������ �մϴ�.");
	}
	
	void bell(){
		System.out.println("���� �︳�ϴ�.");
	}
	
	void powerOff() {
		System.out.println("����Ʈ���� ������ ���ϴ�.");
	}
	
	void sendVoice(String m){
		System.out.println("�� : "+m);
	}
	
	void recieveVoice(String m) {
		System.out.println("���� : " + m);
	}
	
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
