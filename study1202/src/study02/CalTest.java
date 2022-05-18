package study02;

public class CalTest {

	public static void main(String[] args) {
		GoodCalculator gc = new GoodCalculator();
		gc.set_x();
		gc.set_y();
		gc.set_z();
		gc.set_b();
		System.out.println("두 수의 합 = "+gc.add());
		System.out.println("두 수의 차 = "+gc.subtract());
		System.out.println("두 수의 평균 = "+gc.average());
		
	}

}
