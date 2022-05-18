package study;
import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력");
		int num = scan.nextInt();
		if(num >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		}
		if(num < 90) {
			System.out.println("점수가 90보다 작습니다.");
		}
		System.out.println("등급은 B입니다.");
	}

}
