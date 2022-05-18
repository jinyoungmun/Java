package study;

public class CalculExam {

	public static void main(String[] args) {

		Calculator Cal = new Calculator();
		
		Cal.powerOn();
		
		int sum = Cal.add(3, 4);
		System.out.println(sum);
		
		double result = Cal.division(5, 2);
		System.out.println(result);
	}

}
