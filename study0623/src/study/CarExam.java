package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("아벤타도르",350);
		Car myCar2 = new Car("람보르기니",400);
		myCar.color = "검정색";
		myCar.color = "흰색";
		
		System.out.println("내차의 모델은=" +myCar.model);
		System.out.println("내차의 색깔="+myCar.color);
		System.out.println("내차의 최고속도는=" + myCar.max_speed);
		System.out.println(myCar2.model);
		myCar.keyOn();
		
		myCar.run();
		
		myCar.speedup(60);
		myCar.speedup(40);
		
		myCar.speedDown(10);
		myCar.speedDown(20);
		
		
		myCar.addgas(20);
		
		myCar.keyOff();
		
	}

}
