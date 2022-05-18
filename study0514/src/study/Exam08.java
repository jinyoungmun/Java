package study;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		System.out.println("#### 가위 바위 보 게임입니다. ####");
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

}
