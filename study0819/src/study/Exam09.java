package study;

import java.util.Scanner;

public class Exam09 { // ������

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		boolean a = true;
		
		do {
			System.out.print("���� ������ �Է��ϼ���. ==> ");
			num = scan.nextInt();
			if(num>0)
				a = false;
				
		}while(a);
		
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("ī��Ʈ ����!!!");
		
		
	}

}
