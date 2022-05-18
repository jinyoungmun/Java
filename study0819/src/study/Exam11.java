package study;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) { // 문진영

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int num = scan.nextInt();
		int counting = 0;
		if(num<0) {
			System.out.print("다시 입력하세요 >> ");
		num =  scan.nextInt();
	}
		
		System.out.print(num+"의 약수는 >> ");
			for(int i = 1; i<=num; i++) {
				
				if(num%i==0) {
					System.out.print(i);
				counting++;
				}
				}
			System.out.println();
			System.out.print(num+"약수의 개수는 >> "+counting);
			}
		
	}
