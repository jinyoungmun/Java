package study01;

import java.util.Scanner;

public class Won2Dollar extends Converter{
	@Override
	protected void setRatio() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단위를 입력해주세요.");
		ratio = scanner.nextDouble();
		System.out.println("1달러는 "+ratio+"원입니다.");
	}
	
	@Override
	protected String getInString() {
		return "원";
	}

	@Override
	protected String getOutString() {
		return "달러";
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	
	
	
	

}
