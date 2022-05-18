package study;

import java.util.Scanner;
public class Exam04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("x : ");
		
		int x = scan.nextInt();
		
		
		System.out.print("y : ");
		
		int y = scan.nextInt();
		
		if(x>y)
			System.out.println(x+"가"+y+"보다 큽니다.");
		else if(x<y)
			System.out.println(y+"가"+x+"보다 큽니다.");
		else
			System.out.println(x+"와"+y+"가 같습니다.");
		
		
		
	}

}
