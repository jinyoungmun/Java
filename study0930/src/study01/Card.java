package study01;

public class Card {

	static int h=100;
	static int w=60;
	
	String kind;
	int num;
	
	Card(String k, int n){
		kind = k;
		num = n;
	}
	
	static void CardSize() {
		System.out.println("카드의 높이는 "+Card.h+"넓이는 "+Card.w);
	}
	
	
	
	
}
