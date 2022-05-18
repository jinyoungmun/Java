package study02;

import java.util.Scanner;

public abstract class Converter {
	
	
	protected abstract double conver(double src);
	protected abstract String getInString();
	protected abstract String getOutString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(getInString() + "�� "+getOutString()+"�� �ٲߴϴ�.");
		System.out.print(getInString() + "�� �Է��ϼ���>> ");
		double val = scan.nextDouble();
		double result = conver(val);
		System.out.println("��ȯ ��� : "+result + getOutString() + "�Դϴ�.");
	}

}
