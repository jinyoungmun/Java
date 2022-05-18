package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("Æä¶ó¸®",430);
		
		System.out.println(myCar.model);
		System.out.println(myCar.max_speed);
		
		myCar.keyOn();
		myCar.run();
		myCar.speedup(20);
		myCar.speedup(40);
		myCar.speeddown(10);
		
	}

}
