package study02;

public class CalTest {

	public static void main(String[] args) {
		GoodCalculator gc = new GoodCalculator();
		gc.set_x();
		gc.set_y();
		gc.set_z();
		gc.set_b();
		System.out.println("�� ���� �� = "+gc.add());
		System.out.println("�� ���� �� = "+gc.subtract());
		System.out.println("�� ���� ��� = "+gc.average());
		
	}

}
