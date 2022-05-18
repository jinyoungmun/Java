package study01;

import java.util.Scanner;

public abstract class Converter {
	
	protected abstract double convert(double src);
	protected abstract String getInString();
	protected abstract String getOutString();
	protected double ratio;  // ����
	protected abstract void setRatio();
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getInString()+"�� "+getOutString()+"�� �ٲߴϴ�.");
		setRatio();
		System.out.println(getInString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double result = convert(val);
		System.out.println("��ȯ ���: "+ result+ getOutString()+"�Դϴ�.");
		}
		
	}
