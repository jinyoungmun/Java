package study;

public class CalcuExam {

	public static void main(String[] args) {

		Calcu cal = new Calcu();
		
		int[]number = new int[]{4,5,6,7};
		
		int result = cal.add(number);
		
		System.out.println(result);
		
		System.out.println("항목의 평균 값 : " + (double)result/number.length);
		
		cal.sum(4,5,6,7);
		
		System.out.println(cal.sum(1,2,3,4));
		System.out.println(cal.sum(number));
	}

}
