package study0416;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("���̵� �Է�: ");
		String id = scan.next();
		
		System.out.print("��� �Է�: ");
		String pass = scan.next();
		
		if(id.equals("java")) {
			if(pass.equals("12345")) {
				System.out.println("�α����� �Ǿ����ϴ�.");
			}else {
				System.out.println("����� ��ġ���� �ʽ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
	}

}
