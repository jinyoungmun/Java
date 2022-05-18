package stduy;

import java.util.Scanner;

public class CarTest3 {

	public static void main(String[] args) {
		
		System.out.print("현재 속도 입력해주세요. :");
		
		Scanner a = new Scanner(System.in);

		Car myCar = new Car("검정색");
		
		myCar.setspeed(a.nextInt());
		
		myCar.run();
		
		
	}

}
