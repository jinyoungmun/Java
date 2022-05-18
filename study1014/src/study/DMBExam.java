package study;

public class DMBExam {

	public static void main(String[] args) {

		DMBCellPhone dp = new DMBCellPhone("안드로이드폰","흰색",100);
		System.out.println("모델 : " + dp.model);
		System.out.println("색상 : "+ dp.color);
		System.out.println("DMB 채널 : " + dp.channel);
		
		System.out.println();
		
		dp.powerOn();
		dp.bell();
		dp.sendVoice("여보세요? 이가을입니다.");
		dp.recieveVoice("안녕하세요. 저는 강하늘입니다.");
		dp.sendVoice("네, 안녕하세요. 반갑습니다.");
		dp.hangup();
		
		System.out.println();
		
		dp.turnOn();
		dp.changeChannel(20);
		dp.turnOff();
		
		System.out.println();
		
		dp.powerOff();
	}

}
