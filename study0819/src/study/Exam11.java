package study;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) { // ������

		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� >> ");
		int num = scan.nextInt();
		int counting = 0;
		if(num<0) {
			System.out.print("�ٽ� �Է��ϼ��� >> ");
		num =  scan.nextInt();
	}
		
		System.out.print(num+"�� ����� >> ");
			for(int i = 1; i<=num; i++) {
				
				if(num%i==0) {
					System.out.print(i);
				counting++;
				}
				}
			System.out.println();
			System.out.print(num+"����� ������ >> "+counting);
			}
		
	}
