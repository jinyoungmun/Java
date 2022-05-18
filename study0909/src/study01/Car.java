package study01;

public class Car {  // 클래스

	String company;  // 필드
	String model;
	int max_Speed;
	int current_Speed;
	int gas;
	
	Car(String c,String m,int ms,int g){  // 생성자
		company = c;
		model = m;
		max_Speed = ms;
		gas = g;
	}
	
	void set_Current_Speed(int cs){  // 메소드
		current_Speed = cs;
	}
	
	void set_Gas(int g) { // 메소드
		gas = g;
	}
	
	
	boolean isEmptygas() {  // 메소드
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // return 문 다음 줄에 써져 있는 실행문은 실행되지 않는다.
		}else
			System.out.println("gas가 있습니다.");
			return true;
	}
	void run() {  // 메소드
		while(true) {
			if(gas>0) {
				System.out.println("차의 속도는" + current_Speed+"km, 가스는" + gas+"L만큼 남아있습니다.");
				gas--;
				if(current_Speed<60){ /* 작거나 같다가 아니라 작은 이유는 <=60인 경우 60도 포함되므로
				60+10이 되어 70이 되어버린다.
				*/
					current_Speed+=10;
				}
				else if(gas==0) { // if안에 있으므로 0보다 큰 경우에서 줄어 0이 되었을때 주유해야하는 경우
					System.out.println("주유해야 합니다.");
					while(true) {
						current_Speed-=10;
						System.out.println("차의 속도는" + current_Speed+"km, 가스는" + gas+"L만큼 남아있습니다.");
						if(current_Speed <10) {  // == 0 해도 됨
							System.out.println("차는 정지합니다.");
							break;
								}
							}
						}
					}
					//return;을 쓰지 않아도 됨
			else {
				return;  //메소드를 나감  break; 를 써도 된다.
				}
			}
		
	}
}

