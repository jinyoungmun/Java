package study0416;

public class Exam15 {

	public static void main(String[] args) {

		int hour = (int)(Math.random()*4) + 8;
		
		System.out.println("����ð���" + hour +"�Դϴ�");
		
		switch(hour) {
		case 8:
			System.out.println("����մϴ�.");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			//break;
		case 10:
			System.out.println("������ ���ϴ�.");
			//break;
			
			default:
				System.out.println("�ܱ��� �����ϴ�.");
		}
	}

}
