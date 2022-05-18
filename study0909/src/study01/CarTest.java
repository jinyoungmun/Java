package study01;
import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {

		Car MyCar = new Car("쉐보레","스파크",150,50);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(MyCar.company);
		System.out.println(MyCar.model);
		System.out.println(MyCar.max_Speed);
		MyCar.set_Current_Speed(in.nextInt());
		MyCar.set_Gas(in.nextInt());// 입력받는데, 입력이 MyCar.gas로 저장됨
		  // Syso 안에 MyCar.isEmptygas()하면 return 값까지 출력됨.
		
		boolean state = MyCar.isEmptygas(); // 위의 줄에 MyCar.
		if(state == true) {
			System.out.println("차가 출발합니다.");
		}else
			System.out.println("주유해야 합니다.");
		MyCar.run();
	}

}
