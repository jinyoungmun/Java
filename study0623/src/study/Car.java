package study;

public class Car {

	String model;
	String color;
	int max_speed;
	int currentspeed;
	
	 Car(String m, int mx) {
		
		this.model = m;
		this.max_speed = mx;
	}
	
	void keyOn(){
		
		System.out.println("차가 시동이 켜졌습니다.");

	}
	
	void run(){
		System.out.println("차가 주행중 입니다.");
	}
	void speedup(int speed) {
		this.currentspeed += speed;
		System.out.println("현재 차의 속도는 " + this.currentspeed);
	}
	
	void speedDown(int speed){
		this.currentspeed -= speed;
		System.out.println("현재 차의 속도는 " + this.currentspeed);
	}
	
	int addgas(int gas) {
		System.out.println("주유 = "+gas+"리터");
		return gas;
	}
	//? void 로 써서 return 안해도 됨. 변수 저장 안해서
	
	
	void keyOff(){
		System.out.println("차가 시동이 꺼졌습니다.");
	}
	
	
}
