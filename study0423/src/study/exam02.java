package study;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = scan.nextInt();
		if(num >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�");
			System.out.println("����� A�Դϴ�.");
		}
		if(num < 90) {
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("����� B�Դϴ�.");
		}
	}

}
