package study01;
import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {

		Car MyCar = new Car("������","����ũ",150,50);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(MyCar.company);
		System.out.println(MyCar.model);
		System.out.println(MyCar.max_Speed);
		MyCar.set_Current_Speed(in.nextInt());
		MyCar.set_Gas(in.nextInt());// �Է¹޴µ�, �Է��� MyCar.gas�� �����
		  // Syso �ȿ� MyCar.isEmptygas()�ϸ� return ������ ��µ�.
		
		boolean state = MyCar.isEmptygas(); // ���� �ٿ� MyCar.
		if(state == true) {
			System.out.println("���� ����մϴ�.");
		}else
			System.out.println("�����ؾ� �մϴ�.");
		MyCar.run();
	}

}
