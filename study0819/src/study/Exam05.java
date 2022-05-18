package study;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("num : ");
		int num = scan.nextInt();
		
		if(num%10==0)
			System.out.println(num+"은 10의 배수입니다.");
		else
			System.out.println(num+"은 10의 배수가 아닙니다.");
	}

}
