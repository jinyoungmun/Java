package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.print("x 값 입력 : ");
		
		int x = scan.nextInt();
		
		System.out.print("y 값 입력: ");
		
		int y = scan.nextInt();
		
		if(x<y) {
			a=y-x;
		}else {
			a=x-y;
		}
		//재규 코드
		
		//변수 선언 안하고 if(x<0) x=-x; if(y<0) y=-y; 내 코드
		// int 변수 = (x>=y)? (x-y) : (y-x); 쌤 코드
		
		if(a>=10)
			System.out.println("두 값의 차는 10 이상입니다.");
		else
			System.out.println("두 값의 차는 10 미만입니다.");

	}
}
