package study01;

public class ColorPoint extends Point{

	
	String c;
	
	ColorPoint(int a, int b, String c){ //생성자. Point(int x, int y)를 super로 접근
		super(a,b);
		this.c = c;
		
	}
	

	
	void setColor(String c){ // 그냥 색깔 값을 덮어씀
		this.c = c;
		
	}
	
	void setPoint(int x, int y) { // private x, y이기에 접근 불가해서 메소드 move로 접근
		move(x,y);
	}
	void show() {
		System.out.println(c+"색으로"+" ("+getX()+", "+getY()+")"); //getX로 private 필드 x,y 를 따로 return을 통해 접근
	}
	
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5,3,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
	}

}
