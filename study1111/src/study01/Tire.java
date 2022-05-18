package study01;

public class Tire {

	int maxRotation;  // 최대회전수
	String location;  // 타이어의 위치
	int accumRotation; // 누적회전수
	
	Tire(String location,int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	boolean roll() {
		++accumRotation;
		
		if(accumRotation < maxRotation) {
			System.out.println("location + Tire 회전수 : " + (maxRotation-accumRotation) + "회");
			return true;
		}
		else
			System.out.println("<<<<<< " + location + "Tire 타이어 펑크 >>>>>> ");
			return false;
	}
}
