package study;
import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num >= 90) {
			System.out.println("점수는 100~90입니다.");
			System.out.println("등급은 A입니다.");
			}
		else if( num >= 80) {
			System.out.println("점수는 89~80입니다.");
			System.out.println("등급은 B입니다.");
			}
		else if(num >=70) {
			System.out.println("점수는 79~70입니다.");
			System.out.println("등급은 C입니다.");
			}
		else if(num < 70) {
			System.out.println("점수는 70 미만입니다.");
			System.out.println("등급은 D입니다.");
			}
		}
}

