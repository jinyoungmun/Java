package study;
import java.util.Scanner;
public class CarTest {

	public static void main(String[] args) {
		Car MyCar = new Car("���", 300);
		Scanner scan  = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		MyCar.set_Guess(scan.nextInt());
		System.out.print("����ӵ��� �Է��ϼ��� : ");
		MyCar.set_Current_Speed(scan.nextInt());
		MyCar.insempt();
		MyCar.run();
	}

}
