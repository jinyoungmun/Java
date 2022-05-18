package study;// 수업시간에 한 2트 

public class Car {
	String company;
	String model;
	int max_Speed;
	int current_Speed;
	int gas;
	
	Car(String m, int mS){
		model = m;
		max_Speed = mS;
	}
	
	void set_Guess(int g){
		gas = g;
	}
	void set_Current_Speed(int cS){
		current_Speed = cS;
	}
	
	boolean insempt() {
		if(gas>0) {
			System.out.println("가스가 있습니다.");
			return true;
	}
		else
			System.out.println("가스가 없습니다.");
			return false;
	}
	

	
	void run(){
		while(true) {
			if(gas>0) {
				System.out.println("차가 " + current_Speed+"km/h의 속도로 주행합니다. " + "gas 잔량 : "+gas+"리터");
				gas--;
				if(current_Speed <60) {
					current_Speed+=10;
				}
				else if(gas==0) {
					System.out.println("==== 가스가 없습니다. 감속합니다. gas 잔량 : " + gas+"리터 ====");
					while(true) {
						System.out.println("차가 " + current_Speed+"km/h의 속도로 주행합니다. " + "gas 잔량 : "+gas+"리터");
						current_Speed-=10;
						if(current_Speed<10) {
							System.out.println("차가 정지합니다.");
							return;  /* break; return으로 메소드를 바로 나가나 break으로 else if 안의 while 문을 나가도 gas==0이므로 
							else {return;}으로 가게 된다.*/
						}
					}
				}
			}
			else {
				return;
			}
		}
	}
	
}
