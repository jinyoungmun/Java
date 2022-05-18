package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		System.out.println("#### 가위 바위 보 게임입니다. ####");
		while(true) {
			System.out.println("1.게임시작  2.게임종료");
			System.out.print("번호를 입력하세요>> ");
			Scanner scan2 = new Scanner(System.in);
			int num = scan2.nextInt();
			if(num==1) {
			Scanner scan = new Scanner(System.in);
		
		System.out.print("철수 >> ");
		String str1 = scan.next();
		
		
		System.out.print("영희 >> ");
		String str2 = scan.next();
		
		if(str1.equals("바위")) {
			if(str2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(str2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}else
				System.out.println("무승부입니다.");
		}
		else if(str1.equals("가위")) {
			if(str2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(str2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}else
				System.out.println("무승부입니다.");
			
		}else {
			if(str2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(str2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}else
				System.out.println("무승부입니다.");
			
		}
	}
			else {
				break;
			}
			System.out.println();

}
		System.out.println();
		System.out.println("게임을 종료합니다.");
}
}
