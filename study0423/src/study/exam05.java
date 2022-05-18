package study;

public class exam05 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시각 :" + num +"시]");
		switch(num) {
		case 8:
			
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("입무를 봅니다.");
			break;
			default:
			System.out.println("11시 이후부터는 외근을 나갑니다.");

			
		}
	}

}
