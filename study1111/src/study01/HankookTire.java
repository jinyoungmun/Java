package study01;

public class HankookTire extends Tire{
	
	HankookTire(String lo, int max){
		super(lo, max);
	}
	
	@Override
	boolean roll() {
		++accumRotation;
		
		if(accumRotation < maxRotation) {
			System.out.println("location + HankookTire ȸ���� : " + (maxRotation-accumRotation) + "ȸ");
			return true;
		}
		else
			System.out.println("<<<<<< " + location + "HankookTire Ÿ�̾� ��ũ >>>>>> ");
			return false;
	}

}
