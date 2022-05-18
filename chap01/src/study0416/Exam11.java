package study0416;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id = scan.next();
		
		System.out.print("비번 입력: ");
		String pass = scan.next();
		
		if(id.equals("java")) {
			if(pass.equals("12345")) {
				System.out.println("로그인이 되었습니다.");
			}else {
				System.out.println("비번이 일치하지 않습니다.");
			}
		}
		else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
	}

}
