package study0409;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자 입력");
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		System.out.println("두 수의 합: "+sum);
	}

}
