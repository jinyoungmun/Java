package study01;

public class CartTest {

	public static void main(String[] args) {
		
		Card card1 = new Card("하트",7);
		Card card2 = new Card("클로버",10);
		
		
		Card.h = 90;
		Card.w = 50;
		
		System.out.println("카드의 높이는 "+Card.h+"넓이는 "+Card.w);
		
		
		Card.CardSize();
		
		
		System.out.println(Card.h);
		System.out.println(card2.h);
		
		
		//정적 멤버로 선언된 것들은 클래스로 접근, 객체 참조 변수로 접근하는것은 권장하지 않음.
	}
}
