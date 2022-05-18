package study02;

public class RectangleExam {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(10, 20);
		Rectangle rect2 = new Rectangle(10);
		Rectangle rect3 = new Rectangle();
		
		System.out.println(rect1.x+","+rect1.y);
		System.out.println(rect2.x+","+rect2.y);
		System.out.println(rect3.x+","+rect3.y);


	}
}
