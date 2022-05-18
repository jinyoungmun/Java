package study;
import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		switch(str) {
		case "부장":
			System.out.println("상여금 700만원");
			break;
		case "과장":
		System.out.println("상여금 500만원");
		break;
		default:
			System.out.println("상여금 300만원");
		
		}
	}

}
