package study;

import java.util.Scanner;
public class Exam07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		int x = scan.nextInt();
		System.out.print("y 값 입력 : ");
		int y = scan.nextInt();
		System.out.print("z 값 입력 : ");
		int z = scan.nextInt();
		
		int temp;
		
		System.out.println("작은 값에서 큰 값 순으로");// 오름차순으로
		
		if(x>y) {
			temp=x;
			x=y;
			y=temp;
		}if(y>z) {
				temp=y;
				y=z;
				z=temp;
		}if(x>y) {
			temp=x;
			x=y;
			y=temp;
		}
					
					
					
					
	System.out.println("x = "+x);
	System.out.println("y = "+y);
	System.out.println("z = "+z);
			
		
		
	}

}
