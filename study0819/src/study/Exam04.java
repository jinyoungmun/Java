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
			System.out.println(x+"��"+y+"���� Ů�ϴ�.");
		else if(x<y)
			System.out.println(y+"��"+x+"���� Ů�ϴ�.");
		else
			System.out.println(x+"��"+y+"�� �����ϴ�.");
		
		
		
	}

}
