package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("x �� �Է°�� : ");
		
		int x = scan.nextInt();
		
		System.out.print("y �� �Է°�� : ");
		
		int y = scan.nextInt();
		
		if(x%y==0)
			System.out.println(y+"��"+x+"�� ����Դϴ�.");
		else
			System.out.println(y+"��"+x+"�� ����� �ƴմϴ�.");
		
	}

}
