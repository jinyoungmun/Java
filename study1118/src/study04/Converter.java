package study04;

import java.util.Scanner;

	public abstract class Converter {  // ������
	protected abstract double convert(double src);
	protected abstract String getSrcString ();
	protected abstract String getDesString();
	protected double ratio; // ����
	
	
	public void run() {
	Scanner scanner = new Scanner(System.in);
	System.out.println(getSrcString() +"�� "+ getDesString()+"�� �ٲߴϴ�.");
	System.out.print(getSrcString() +"�� �Է��ϼ���>> ");
	double val = scanner.nextDouble();
	double result = convert(val);
	System.out.println("��ȯ ���: " + result + getDesString() + "�Դϴ�.");

	}
}