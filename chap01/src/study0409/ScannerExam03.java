package study0409;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ���� �Է�");
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		System.out.println("�� ���� ��: "+sum);
	}

}
