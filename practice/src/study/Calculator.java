package study;

public class Calculator {
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int sum(int a, int b) {
		return a+b;
	}
	
	double division(int a, int b) {
		return (double)a/b;
	}
	
	double avg(int a, int b) {
		return ((double)a+b)/2;
	}
	
	}