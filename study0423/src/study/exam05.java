package study;

public class exam05 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*4) + 8;
		System.out.println("[���� �ð� :" + num +"��]");
		switch(num) {
		case 8:
			
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("�Թ��� ���ϴ�.");
			break;
			default:
			System.out.println("11�� ���ĺ��ʹ� �ܱ��� �����ϴ�.");

			
		}
	}

}
