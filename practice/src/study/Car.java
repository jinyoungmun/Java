package study;

public class Car {
	
	String model;
	String color;
	int max_speed;
	int current_speed;
	
	
	Car(String m, int sp){
		this.model = m;
		this.max_speed = sp;
	}
	
	void keyOn() {
		System.out.println("차가 시동이 꺼졌습니다.");
	}
	
	void run() {
		System.out.println("차가 주행중 입니다.");
	}
	
	void speedup(int sp) {
		this.current_speed += sp;
		System.out.println("현재 차의 속도는 = " + this.current_speed);
	}
	
	void speeddown(int sp) {
		this.current_speed -= sp;
		System.out.println("현재 차의 속도는 = " + this.current_speed);
	}

}
