package study;

import java.util.Random;

import java.util.Scanner;

public class Exam10 { // 문진영

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean a = true;
		
		int num;
		
		int ran = rand.nextInt(90)+10;
		
		System.out.print("숫자 맞추기 게임을 시작합니다.");
		
		do {
			System.out.println("10~99 사이의 숫자를 맞추세요.");
			System.out.println("발생된 숫자는?");
			num = scan.nextInt();
			if(num>ran) {
			System.out.println("더 작은 수를 입력하세요.");
			}
			if(num<ran) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			if(num==ran) {
				System.out.println("정답입니다.");
				a = false;
			}
		}
			while(a);
		
		
	}

}
