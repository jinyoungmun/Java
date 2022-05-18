package study02;

public class PlaneTest {

	public static void main(String[] args) {

		SupersonicAirplane s = new SupersonicAirplane();
		
		s.takeoff();
		s.fly();
		s.flyMode = SupersonicAirplane.SUPERSONIC;///static 이므로 클래스로 접근
		s.fly();
		s.flyMode = SupersonicAirplane.NORMAL;
		s.fly();
		s.land();
	}

}
