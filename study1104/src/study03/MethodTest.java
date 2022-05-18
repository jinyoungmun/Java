package study03;

public class MethodTest {
	
	static void paint(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		paint(new Shape());
		paint(new Line());
		paint(new Rectangle());
	}

}
