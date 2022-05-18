package study01;

public class Car {
	
	Tire frontLeft = new Tire("앞 왼쪽", 4);
	Tire frontRight = new Tire("앞 오른쪽", 3);
	Tire backLeft = new Tire("뒤 왼쪾", 6);
	Tire backRight = new Tire("뒤 오른쪽", 2);
	
	int run() {
		System.out.println("자동차가 주행합니다.");
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
		System.out.println("지동차를 멈춥니다.");
	}

}
