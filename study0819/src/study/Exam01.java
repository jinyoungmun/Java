package study;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println("���� �Է� : " + num);
		
		if(num<0)
			System.out.println(num + "�� \"����\"�̴�.");
		else if(num ==0)
			System.out.println(num + "�� \"0\"�̴�.");
		else
			System.out.println(num + "�� \"���\"�̴�.");
	}

}
