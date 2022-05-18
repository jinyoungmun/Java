package study;

public class CalExam {

	public static void main(String[] args) {

		Calculator Cal = new Calculator();
		
		Cal.powerOn();
		
		int plus = Cal.sum(5, 2);
		
		double divide = Cal.division(5, 2);
		
		Cal.avg(5, 2);
		
		System.out.println("plus = " + plus);
		System.out.println("divide = "+divide);
		System.out.println(Cal.avg(5,2));
		
		Cal.powerOff();
		
	}

}
