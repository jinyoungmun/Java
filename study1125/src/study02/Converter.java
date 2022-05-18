package study02;

import java.util.Scanner;

public abstract class Converter {
	
	
	protected abstract double conver(double src);
	protected abstract String getInString();
	protected abstract String getOutString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(getInString() + "을 "+getOutString()+"로 바꿉니다.");
		System.out.print(getInString() + "을 입력하세요>> ");
		double val = scan.nextDouble();
		double result = conver(val);
		System.out.println("변환 결과 : "+result + getOutString() + "입니다.");
	}

}
