package study;
import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		switch(str) {
		case "A":
		case "a":
			System.out.println("���ȸ���Դϴ�.");
			break;
		case "B":
		case "b":
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			break;
			default:
				System.out.println("��ȸ���Դϴ�.");
			
		}
		
	}

}
