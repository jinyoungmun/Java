package study0416;
import java.util.Scanner;
public class Exam13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		int jumsu = scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("100~90�����Դϴ�.");
			System.out.println("A���");
		}else if(jumsu>=80) {
			System.out.println("89~80�����Դϴ�");
			System.out.println("B���");
		}else if(jumsu>=70) {
			System.out.println("79~70�����Դϴ�.");
			System.out.println("C���");
		}else {
			System.out.println("70�̸� �����Դϴ�.");
			System.out.println("D���");
		}
	}

}
