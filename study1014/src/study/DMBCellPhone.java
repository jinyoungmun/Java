package study;

public class DMBCellPhone extends CellPhone {

	int channel;
	
	DMBCellPhone(String m, String c, int ch){
		model = m;
		color = c;
		channel = ch;
	}
	
	void turnOn(){
		System.out.println("ä��"+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannel(int ch){
		channel = ch;
		System.out.println("ä��"+ch+"������ �ٲߴϴ�.");
	}
	
	void turnOff() {
		System.out.println("DMB ����� �����մϴ�.");
	}
	
}

