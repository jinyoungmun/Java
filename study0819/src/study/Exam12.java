package study;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) { //������

		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �ϳ� �Է� >>");
		int num = scan.nextInt();
		
		int count = 0;
		
		System.out.print("1");
		for(int i = 2; i<=num; i++) {
			count=count+i;
			System.out.print("+ "+i);
		}
		
		System.out.print("="+(count+1));
	}

}
