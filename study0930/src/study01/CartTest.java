package study01;

public class CartTest {

	public static void main(String[] args) {
		
		Card card1 = new Card("��Ʈ",7);
		Card card2 = new Card("Ŭ�ι�",10);
		
		
		Card.h = 90;
		Card.w = 50;
		
		System.out.println("ī���� ���̴� "+Card.h+"���̴� "+Card.w);
		
		
		Card.CardSize();
		
		
		System.out.println(Card.h);
		System.out.println(card2.h);
		
		
		//���� ����� ����� �͵��� Ŭ������ ����, ��ü ���� ������ �����ϴ°��� �������� ����.
	}
}
