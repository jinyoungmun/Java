package study02;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	int flyMode = NORMAL;
	
	@Override
	void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ������ �մϴ�.");
		}
		else {
			super.fly();
		}
		
	}
	
	
}
