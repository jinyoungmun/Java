package study01;

public class Car {
	
	Tire frontLeft = new Tire("�� ����", 4);
	Tire frontRight = new Tire("�� ������", 3);
	Tire backLeft = new Tire("�� �ަU", 6);
	Tire backRight = new Tire("�� ������", 2);
	
	int run() {
		System.out.println("�ڵ����� �����մϴ�.");
		if(frontLeft.roll() == false) {
			stop();
			return 1;
			
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(backLeft.roll() == false) {
			stop();
			return 3;
		}
		if(backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�������� ����ϴ�.");
	}

}
