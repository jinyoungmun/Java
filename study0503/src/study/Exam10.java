package study;

public class Exam10 {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("�ֻ����� ���� 5�� �Ǹ� �۵��� �����մϴ�.");
		while(true) {
			num1 = (int) (Math.random()*6)+1;
			num2 = (int) (Math.random()*6)+1;
			System.out.println("("+num1+","+num2+")");
			if(num1+num2==5) {
				break;
			}
			
		}
		System.out.println("�۵��� �����մϴ�.");
	}

}
