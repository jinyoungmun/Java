package study01;

public class HankookTire extends Tire{
	
	HankookTire(String lo, int max){
		super(lo, max);
	}
	
	@Override
	boolean roll() {
		++accumRotation;
		
		if(accumRotation < maxRotation) {
			System.out.println("location + HankookTire 회전수 : " + (maxRotation-accumRotation) + "회");
			return true;
		}
		else
			System.out.println("<<<<<< " + location + "HankookTire 타이어 펑크 >>>>>> ");
			return false;
	}

}
