package study02;

public class ConverterTest {

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar(1200);  // 1달러는 1200원
		toDollar.run();
		
		System.out.println("-----------------");
		
		Km2Mile toMile = new Km2Mile(1.6);  // 1마일은 1.6km
		toMile.run();
	}

}
