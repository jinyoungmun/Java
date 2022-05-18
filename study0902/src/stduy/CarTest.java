package stduy;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.color = "°ËÁ¤»ö";
		myCar.oner = "Jinyoung";
		myCar.max_Speed = 300;
		myCar.model = "Urus";
		myCar.company = "Lambo";
		
		System.out.printf("color = %s\n",myCar.color);
		System.out.println("oner = " + myCar.oner);
		
		
	}

}
