package study02;

public class ConverterTest {

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar(1200);  // 1�޷��� 1200��
		toDollar.run();
		
		System.out.println("-----------------");
		
		Km2Mile toMile = new Km2Mile(1.6);  // 1������ 1.6km
		toMile.run();
	}

}