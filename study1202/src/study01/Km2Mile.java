package study01;

import java.util.Scanner;

public class Km2Mile extends Converter{
		@Override
		protected void setRatio() {

			Scanner scanner = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���");
			ratio = scanner.nextDouble();
			System.out.println("1km �� "+ratio+"mile �Դϴ�.");
			
			
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