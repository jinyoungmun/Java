package study;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("����ȸ�� = " + myCar.company);
		System.out.println("�� = " + myCar.model);
		System.out.println("���� = "+ myCar.color);
		System.out.println("�ְ�ӵ� = "+ myCar.maxSpeed);
		myCar.currentSpeed = 100;
		System.out.println("����ӵ� = " + myCar.currentSpeed);

	}

}
