package stduy;

public class Car {
	
	String color;
	int current_Speed;
	
	Car(String color){
		this.color = color;
	}
	
	void setspeed(int cs) {
		
		current_Speed = cs;
	}
	
	void run() {
		for(int i = this.current_Speed; i<=60 ; i+=10) {
			this.current_Speed = i;
			System.out.printf("���� �ӵ� : %d \n",i);
			if(current_Speed >= 60) {
				System.out.printf("�ְ� �ӵ� �Դϴ�.");
			}
		}
	}
	
}
