package study01;

public class Tire {

	int maxRotation;  // �ִ�ȸ����
	String location;  // Ÿ�̾��� ��ġ
	int accumRotation; // ����ȸ����
	
	Tire(String location,int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	boolean roll() {
		++accumRotation;
		
		if(accumRotation < maxRotation) {
			System.out.println("location + Tire ȸ���� : " + (maxRotation-accumRotation) + "ȸ");
			return true;
		}
		else
			System.out.println("<<<<<< " + location + "Tire Ÿ�̾� ��ũ >>>>>> ");
			return false;
	}
}
