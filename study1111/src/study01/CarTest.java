package study01;

public class CarTest {

	public static void main(String[] args) {

		
		Car myCar = new Car();
		
		for(int i = 0; i<5; i++) {
			int event = myCar.run();
		
		
		switch(event) {
		case 1:
			System.out.println("���� ���� Ÿ�̾ HankookTire ��ü");
			myCar.frontLeft = new HankookTire("�� ����", 12);
			break;
			
		case 2:
			System.out.println("���� ������ Ÿ�̾ HankookTire ��ü");
		myCar.frontRight = new HankookTire("�� ������", 12);
		break;
		
		case 3:
		System.out.println("���� ���� Ÿ�̾ kumhoTire ��ü");
		myCar.backLeft = new HankookTire("�� ����", 12);
		 break;
		
		case 4:
		System.out.println("���� ������ Ÿ�̾ kumhoTire ��ü");
		myCar.backRight = new HankookTire("�� ������ ", 12);
		 break;
		
	}
		System.out.println("-----------------");

		}
	}
}
		
