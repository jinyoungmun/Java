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
		
		System.out.println("���� �õ��� �������ϴ�.");

	}
	
	void run(){
		System.out.println("���� ������ �Դϴ�.");
	}
	void speedup(int speed) {
		this.currentspeed += speed;
		System.out.println("���� ���� �ӵ��� " + this.currentspeed);
	}
	
	void speedDown(int speed){
		this.currentspeed -= speed;
		System.out.println("���� ���� �ӵ��� " + this.currentspeed);
	}
	
	int addgas(int gas) {
		System.out.println("���� = "+gas+"����");
		return gas;
	}
	//? void �� �Ἥ return ���ص� ��. ���� ���� ���ؼ�
	
	
	void keyOff(){
		System.out.println("���� �õ��� �������ϴ�.");
	}
	
	
}
