package study0416;
import java.util.Scanner;
public class Exam13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int jumsu = scan.nextInt();
		
		if(jumsu>=90) {
			System.out.println("100~90점수입니다.");
			System.out.println("A등급");
		}else if(jumsu>=80) {
			System.out.println("89~80점수입니다");
			System.out.println("B등급");
		}else if(jumsu>=70) {
			System.out.println("79~70점수입니다.");
			System.out.println("C등급");
		}else {
			System.out.println("70미만 점수입니다.");
			System.out.println("D등급");
		}
	}

}
