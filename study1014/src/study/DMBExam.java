package study;

public class DMBExam {

	public static void main(String[] args) {

		DMBCellPhone dp = new DMBCellPhone("�ȵ���̵���","���",100);
		System.out.println("�� : " + dp.model);
		System.out.println("���� : "+ dp.color);
		System.out.println("DMB ä�� : " + dp.channel);
		
		System.out.println();
		
		dp.powerOn();
		dp.bell();
		dp.sendVoice("��������? �̰����Դϴ�.");
		dp.recieveVoice("�ȳ��ϼ���. ���� ���ϴ��Դϴ�.");
		dp.sendVoice("��, �ȳ��ϼ���. �ݰ����ϴ�.");
		dp.hangup();
		
		System.out.println();
		
		dp.turnOn();
		dp.changeChannel(20);
		dp.turnOff();
		
		System.out.println();
		
		dp.powerOff();
	}

}
