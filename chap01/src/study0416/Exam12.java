package study0416;

import java.util.Scanner;
public class Exam12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요>>");
		
		int jumsu =  scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("점수는 90보다 크거나 같습니다.");
			System.out.println("A등급 입니다.");
		}else {
			System.out.println("점수는 90보다 작습니다");
			System.out.println("B등급 입니다.");
			}
	}

}
