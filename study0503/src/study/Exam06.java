package study;

public class Exam06 {

	public static void main(String[] args) {

		int num;
		
		while(true) {
			num = (int)(Math.random()*6)+1;
			System.out.println("뽑힌 주사위 번호 :"+num);
			if(num == 6) {
				System.out.println("주사위 프로그램을 중지합니다.");
				break;
			}
		}
	}

}
