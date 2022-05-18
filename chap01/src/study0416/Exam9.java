package study0416;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자:");
		double x = scan.nextDouble();
		
		System.out.print("두 번째 숫자:");
		double y = scan.nextDouble();
		
		double result = x/y;
		if(y==0.0 || y ==0) 
			System.out.println("결과: 무한대");
		else 
		System.out.println("result =" + result);
	}

}
