package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		System.out.println("#### ���� ���� �� �����Դϴ�. ####");
		while(true) {
			System.out.println("1.���ӽ���  2.��������");
			System.out.print("��ȣ�� �Է��ϼ���>> ");
			Scanner scan2 = new Scanner(System.in);
			int num = scan2.nextInt();
			if(num==1) {
			Scanner scan = new Scanner(System.in);
		
		System.out.print("ö�� >> ");
		String str1 = scan.next();
		
		
		System.out.print("���� >> ");
		String str2 = scan.next();
		
		if(str1.equals("����")) {
			if(str2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else if(str2.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
			}else
				System.out.println("���º��Դϴ�.");
		}
		else if(str1.equals("����")) {
			if(str2.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}else if(str2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else
				System.out.println("���º��Դϴ�.");
			
		}else {
			if(str2.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}else if(str2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else
				System.out.println("���º��Դϴ�.");
			
		}
	}
			else {
				break;
			}
			System.out.println();

}
		System.out.println();
		System.out.println("������ �����մϴ�.");
}
}
