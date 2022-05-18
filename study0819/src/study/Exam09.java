package study;

import java.util.Scanner;

public class Exam09 { // 문진영

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		boolean a = true;
		
		do {
			System.out.print("양의 정수를 입력하세요. ==> ");
			num = scan.nextInt();
			if(num>0)
				a = false;
				
		}while(a);
		
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("카운트 종료!!!");
		
		
	}

}
