package study;// �����ð��� �� 2Ʈ 

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
			System.out.println("������ �ֽ��ϴ�.");
			return true;
	}
		else
			System.out.println("������ �����ϴ�.");
			return false;
	}
	

	
	void run(){
		while(true) {
			if(gas>0) {
				System.out.println("���� " + current_Speed+"km/h�� �ӵ��� �����մϴ�. " + "gas �ܷ� : "+gas+"����");
				gas--;
				if(current_Speed <60) {
					current_Speed+=10;
				}
				else if(gas==0) {
					System.out.println("==== ������ �����ϴ�. �����մϴ�. gas �ܷ� : " + gas+"���� ====");
					while(true) {
						System.out.println("���� " + current_Speed+"km/h�� �ӵ��� �����մϴ�. " + "gas �ܷ� : "+gas+"����");
						current_Speed-=10;
						if(current_Speed<10) {
							System.out.println("���� �����մϴ�.");
							return;  /* break; return���� �޼ҵ带 �ٷ� ������ break���� else if ���� while ���� ������ gas==0�̹Ƿ� 
							else {return;}���� ���� �ȴ�.*/
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
