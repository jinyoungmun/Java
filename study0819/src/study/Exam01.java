package study;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println("정수 입력 : " + num);
		
		if(num<0)
			System.out.println(num + "은 \"음수\"이다.");
		else if(num ==0)
			System.out.println(num + "은 \"0\"이다.");
		else
			System.out.println(num + "은 \"양수\"이다.");
	}

}
