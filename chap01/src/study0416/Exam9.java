package study0416;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ����:");
		double x = scan.nextDouble();
		
		System.out.print("�� ��° ����:");
		double y = scan.nextDouble();
		
		double result = x/y;
		if(y==0.0 || y ==0) 
			System.out.println("���: ���Ѵ�");
		else 
		System.out.println("result =" + result);
	}

}
