package study01;

public class Car {  // Ŭ����

	String company;  // �ʵ�
	String model;
	int max_Speed;
	int current_Speed;
	int gas;
	
	Car(String c,String m,int ms,int g){  // ������
		company = c;
		model = m;
		max_Speed = ms;
		gas = g;
	}
	
	void set_Current_Speed(int cs){  // �޼ҵ�
		current_Speed = cs;
	}
	
	void set_Gas(int g) { // �޼ҵ�
		gas = g;
	}
	
	
	boolean isEmptygas() {  // �޼ҵ�
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // return �� ���� �ٿ� ���� �ִ� ���๮�� ������� �ʴ´�.
		}else
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
	}
	void run() {  // �޼ҵ�
		while(true) {
			if(gas>0) {
				System.out.println("���� �ӵ���" + current_Speed+"km, ������" + gas+"L��ŭ �����ֽ��ϴ�.");
				gas--;
				if(current_Speed<60){ /* �۰ų� ���ٰ� �ƴ϶� ���� ������ <=60�� ��� 60�� ���ԵǹǷ�
				60+10�� �Ǿ� 70�� �Ǿ������.
				*/
					current_Speed+=10;
				}
				else if(gas==0) { // if�ȿ� �����Ƿ� 0���� ū ��쿡�� �پ� 0�� �Ǿ����� �����ؾ��ϴ� ���
					System.out.println("�����ؾ� �մϴ�.");
					while(true) {
						current_Speed-=10;
						System.out.println("���� �ӵ���" + current_Speed+"km, ������" + gas+"L��ŭ �����ֽ��ϴ�.");
						if(current_Speed <10) {  // == 0 �ص� ��
							System.out.println("���� �����մϴ�.");
							break;
								}
							}
						}
					}
					//return;�� ���� �ʾƵ� ��
			else {
				return;  //�޼ҵ带 ����  break; �� �ᵵ �ȴ�.
				}
			}
		
	}
}

