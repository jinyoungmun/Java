package study02;

public class Rectangle {
	int x;
	int y;
	
	Rectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Rectangle(int x){
		this(x,2);
	}
	Rectangle(){
		this.x=1;
		this.y=2;
	}
	
}
