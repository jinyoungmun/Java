package study;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int n = scan.nextInt();
		
		if(n<0)
			System.out.println("절대값 : "+-n);
		else
			System.out.println("절대값 : "+n);
		
	}

}
