package study;

public class Exam02 {

	public static void main(String[] args) {
		
		int sum = 0;

		System.out.println("#### 3의 배수의 합을 구하는 프로그램 ####");
		for(int i = 1; i<=100; i++) {
			if(i%3==0)
			sum+=i;
		}
		System.out.println(sum);
	}

}
