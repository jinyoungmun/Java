package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		System.out.println("#### ���� ���� �� �����Դϴ�. ####");
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

}
