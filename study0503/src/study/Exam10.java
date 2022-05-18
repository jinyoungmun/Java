package study;

public class Exam10 {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("주사위의 합이 5가 되면 작동을 중지합니다.");
		while(true) {
			num1 = (int) (Math.random()*6)+1;
			num2 = (int) (Math.random()*6)+1;
			System.out.println("("+num1+","+num2+")");
			if(num1+num2==5) {
				break;
			}
			
		}
		System.out.println("작동을 중지합니다.");
	}

}
