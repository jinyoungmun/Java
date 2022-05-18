package sec01.exam01;

public class Exam03 {

	public static void main(String[] args) {

		long v1 = 2L;
		float v2 = 1.8f;
		double v3 = 2.5;
		String v4 = "3.9";
		
		int result = (int)(v1+(int)v2+v3+Double.parseDouble(v4));
		System.out.println(result);
	}

}
