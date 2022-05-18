package study;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //문진영
		int month;
		int retry;
		do {
			do {
				System.out.print("1 ~ 12사이의 숫자를 입력하세요.>> ");
				month = scan.nextInt();
			}while(month <1 || month >12);
			
			if(month>=3 && month<=5) {
				System.out.printf("%d월은 \"봄\" 입니다.",month);
			}else if(month >= 6 && month<=8) {
				System.out.printf("%d월은 \"여름\" 입니다.",month);
			}else if(month >=9 && month<=10){
				System.out.printf("%d월은 \"가을\" 입니다.",month);
			}else {
				System.out.printf("%d월은 \"겨울\" 입니다.",month);
			}
			
			System.out.println("\n ------------------------");
			System.out.print("다시 하려면 \"1\", 종료하려면 \"0\"을 입력하시오.>> ");
			retry = scan.nextInt();
	}while(retry == 1);
		System.out.println("프로그램이 종료되었습니다.");

	}
}
