package study02;

public class ColorPoint extends Point {

	private String color;
	
	void setColor(String c){
		 color = c;
	}
	
	void showColorPoint(){
		System.out.print(color);
		showPoint();
	}
}
