package study;
import java.util.Scanner;
public class CarTest {

	public static void main(String[] args) {
		Car MyCar = new Car("페라리", 300);
		Scanner scan  = new Scanner(System.in);
		System.out.print("가스를 입력하세요 : ");
		MyCar.set_Guess(scan.nextInt());
		System.out.print("현재속도를 입력하세요 : ");
		MyCar.set_Current_Speed(scan.nextInt());
		MyCar.insempt();
		MyCar.run();
	}

}
