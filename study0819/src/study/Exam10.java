package study;

import java.util.Random;

import java.util.Scanner;

public class Exam10 { // ������

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean a = true;
		
		int num;
		
		int ran = rand.nextInt(90)+10;
		
		System.out.print("���� ���߱� ������ �����մϴ�.");
		
		do {
			System.out.println("10~99 ������ ���ڸ� ���߼���.");
			System.out.println("�߻��� ���ڴ�?");
			num = scan.nextInt();
			if(num>ran) {
			System.out.println("�� ���� ���� �Է��ϼ���.");
			}
			if(num<ran) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
			if(num==ran) {
				System.out.println("�����Դϴ�.");
				a = false;
			}
		}
			while(a);
		
		
	}

}
