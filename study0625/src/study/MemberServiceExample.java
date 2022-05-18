package study;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		MemberService member = new MemberService();
		
		boolean result = member.login(scan.next(),scan.next());

		if(result == true) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		member.logout();
	}

}
