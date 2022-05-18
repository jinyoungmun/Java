package study;
import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		switch(str) {
		case "A":
		case "a":
			System.out.println("우수회원입니다.");
			break;
		case "B":
		case "b":
			System.out.println("일반회원입니다.");
			break;
			default:
				System.out.println("비회원입니다.");
			
		}
		
	}

}
