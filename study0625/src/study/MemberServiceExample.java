package study;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		MemberService member = new MemberService();
		
		boolean result = member.login(scan.next(),scan.next());

		if(result == true) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		member.logout();
	}

}
