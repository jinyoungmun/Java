package study;

public class Exam06 {

	public static void main(String[] args) {

		int num;
		
		while(true) {
			num = (int)(Math.random()*6)+1;
			System.out.println("���� �ֻ��� ��ȣ :"+num);
			if(num == 6) {
				System.out.println("�ֻ��� ���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
