package study02;
// 정적 멤버 변수 = 클래스 변수 선언, 정적 메소드 선언
public class Calculator {
	static double pi = 3.141592;
	
	static int plus (int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	static double multiply(double x, int y) {
		return x*y;
	}
}
