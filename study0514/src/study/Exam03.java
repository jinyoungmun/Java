package study;

public class Exam03 {

	public static void main(String[] args) {

		System.out.println("#### 두개 주사위 던져 수를 더해 5가 나오면 종료 ####");
		
		while(true) {
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		System.out.printf("(%d, %d)\n",dice1, dice2);
		
		if(dice1 + dice2 == 5) {
			break;
		}
		}
		System.out.println("#### 주사위 게임을 종료합니다 ####");
	}

}
