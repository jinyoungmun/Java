package study01;

import java.util.Scanner;

public abstract class Converter {
	
	protected abstract double convert(double src);
	protected abstract String getInString();
	protected abstract String getOutString();
	protected double ratio;  // 비율
	protected abstract void setRatio();
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getInString()+"을 "+getOutString()+"로 바꿉니다.");
		setRatio();
		System.out.println(getInString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();
		double result = convert(val);
		System.out.println("변환 결과: "+ result+ getOutString()+"입니다.");
		}
		
	}
