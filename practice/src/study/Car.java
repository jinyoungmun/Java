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
		System.out.println("���� �õ��� �������ϴ�.");
	}
	
	void run() {
		System.out.println("���� ������ �Դϴ�.");
	}
	
	void speedup(int sp) {
		this.current_speed += sp;
		System.out.println("���� ���� �ӵ��� = " + this.current_speed);
	}
	
	void speeddown(int sp) {
		this.current_speed -= sp;
		System.out.println("���� ���� �ӵ��� = " + this.current_speed);
	}

}
