package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.print("x �� �Է� : ");
		
		int x = scan.nextInt();
		
		System.out.print("y �� �Է�: ");
		
		int y = scan.nextInt();
		
		if(x<y) {
			a=y-x;
		}else {
			a=x-y;
		}
		//��� �ڵ�
		
		//���� ���� ���ϰ� if(x<0) x=-x; if(y<0) y=-y; �� �ڵ�
		// int ���� = (x>=y)? (x-y) : (y-x); �� �ڵ�
		
		if(a>=10)
			System.out.println("�� ���� ���� 10 �̻��Դϴ�.");
		else
			System.out.println("�� ���� ���� 10 �̸��Դϴ�.");

	}
}
