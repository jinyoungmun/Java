package study01;

import java.util.Scanner;

public class Won2Dollar extends Converter{
	@Override
	protected void setRatio() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		ratio = scanner.nextDouble();
		System.out.println("1�޷��� "+ratio+"���Դϴ�.");
	}
	
	@Override
	protected String getInString() {
		return "��";
	}

	@Override
	protected String getOutString() {
		return "�޷�";
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	
	
	
	

}
