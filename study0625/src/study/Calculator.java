package study;

public class Calculator {

	int plus(int x, int y) {
		return x+y;
	}
	
	double average(int x, int y) {
		double sum = plus(x, y);
		double result = sum/2;
		return result;
	}
	
	void resultPrint(String abc) {
		System.out.println(abc);
	}
	
	void run() {
		double result = average(7,10);
		resultPrint("실행결과 : "+result);
	}
}
