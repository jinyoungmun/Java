package study;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car("�ƺ�Ÿ����",350);
		Car myCar2 = new Car("���������",400);
		myCar.color = "������";
		myCar.color = "���";
		
		System.out.println("������ ����=" +myCar.model);
		System.out.println("������ ����="+myCar.color);
		System.out.println("������ �ְ�ӵ���=" + myCar.max_speed);
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
