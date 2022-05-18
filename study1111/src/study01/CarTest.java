package study01;

public class CarTest {

	public static void main(String[] args) {

		
		Car myCar = new Car();
		
		for(int i = 0; i<5; i++) {
			int event = myCar.run();
		
		
		switch(event) {
		case 1:
			System.out.println("앞쪽 왼쪽 타이어를 HankookTire 교체");
			myCar.frontLeft = new HankookTire("앞 왼쪽", 12);
			break;
			
		case 2:
			System.out.println("앞쪽 오른쪽 타이어를 HankookTire 교체");
		myCar.frontRight = new HankookTire("앞 오른쪽", 12);
		break;
		
		case 3:
		System.out.println("뒤쪽 왼쪽 타이어를 kumhoTire 교체");
		myCar.backLeft = new HankookTire("앞 왼쪽", 12);
		 break;
		
		case 4:
		System.out.println("뒤쪽 오른쪽 타이어를 kumhoTire 교체");
		myCar.backRight = new HankookTire("앞 오른쪽 ", 12);
		 break;
		
	}
		System.out.println("-----------------");

		}
	}
}
		
