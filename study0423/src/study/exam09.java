package study;
import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오.>>");
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println(num+"의 절대값 :"+ num);
		}
		else {
		num = -num;
			System.out.println(num+"의 절대값 :"+ num);
		}
	}

}
