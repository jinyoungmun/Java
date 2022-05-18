package study;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("x 값 입력결과 : ");
		
		int x = scan.nextInt();
		
		System.out.print("y 값 입력결과 : ");
		
		int y = scan.nextInt();
		
		if(x%y==0)
			System.out.println(y+"는"+x+"의 약수입니다.");
		else
			System.out.println(y+"는"+x+"의 약수가 아닙니다.");
		
	}

}
