package study;

import java.util.Scanner;
public class Exam07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("x �� �Է� : ");
		int x = scan.nextInt();
		System.out.print("y �� �Է� : ");
		int y = scan.nextInt();
		System.out.print("z �� �Է� : ");
		int z = scan.nextInt();
		
		int temp;
		
		System.out.println("���� ������ ū �� ������");// ������������
		
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
