package study01;

import java.util.Scanner;

public class Km2Mile extends Converter{
		@Override
		protected void setRatio() {

			Scanner scanner = new Scanner(System.in);
			System.out.println("단위를 입력하세요");
			ratio = scanner.nextDouble();
			System.out.println("1km 는 "+ratio+"mile 입니다.");
			
			
		}
	
		@Override
		protected String getInString() {
			return "km";
		}

		@Override
		protected String getOutString() {
			return "mile";
		}
		
		@Override
		protected double convert(double src) {
			return src/ratio;
		}
		
		
		

	}