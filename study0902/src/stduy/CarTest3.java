package stduy;

import java.util.Scanner;

public class CarTest3 {

	public static void main(String[] args) {
		
		System.out.print("���� �ӵ� �Է����ּ���. :");
		
		Scanner a = new Scanner(System.in);

		Car myCar = new Car("������");
		
		myCar.setspeed(a.nextInt());
		
		myCar.run();
		
		
	}

}
