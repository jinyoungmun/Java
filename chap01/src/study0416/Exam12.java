package study0416;

import java.util.Scanner;
public class Exam12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���>>");
		
		int jumsu =  scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("A��� �Դϴ�.");
		}else {
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("B��� �Դϴ�.");
			}
	}

}
