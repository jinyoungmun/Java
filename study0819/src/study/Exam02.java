package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int n = scan.nextInt();
		
		if(n<0)
			System.out.println("���밪 : "+-n);
		else
			System.out.println("���밪 : "+n);
		
	}

}
