package study0409;

import java.util.Scanner;

public class ScannerExam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ��� �Է� ��������");
		String str = scan.nextLine();
		
		System.out.print("ù ��° �Ǽ��� �Է��� �ּ���");
		double x = scan.nextDouble();
		
		System.out.print("�� ���� ���ڴ� ������ �Է��� �ּ���");
		int y = scan.nextInt();
		
	
		
		double sum = x + y;
		System.out.println("sum = "+ sum);
		System.out.println("�Էµ� ������ : " + str);
	}

}
