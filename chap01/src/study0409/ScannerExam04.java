package study0409;

import java.util.Scanner;

public class ScannerExam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력 받으세요");
		String str = scan.nextLine();
		
		System.out.print("첫 번째 실수를 입력해 주세요");
		double x = scan.nextDouble();
		
		System.out.print("두 번쨰 숫자는 정수를 입력해 주세요");
		int y = scan.nextInt();
		
	
		
		double sum = x + y;
		System.out.println("sum = "+ sum);
		System.out.println("입력된 문장은 : " + str);
	}

}
