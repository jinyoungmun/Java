package study02;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	int flyMode = NORMAL;
	
	@Override
	void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}
		else {
			super.fly();
		}
		
	}
	
	
}
