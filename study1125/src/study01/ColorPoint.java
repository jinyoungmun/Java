package study01;

public class ColorPoint extends Point{

	
	String c;
	
	ColorPoint(int a, int b, String c){ //������. Point(int x, int y)�� super�� ����
		super(a,b);
		this.c = c;
		
	}
	

	
	void setColor(String c){ // �׳� ���� ���� ���
		this.c = c;
		
	}
	
	void setPoint(int x, int y) { // private x, y�̱⿡ ���� �Ұ��ؼ� �޼ҵ� move�� ����
		move(x,y);
	}
	void show() {
		System.out.println(c+"������"+" ("+getX()+", "+getY()+")"); //getX�� private �ʵ� x,y �� ���� return�� ���� ����
	}
	
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5,3,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
	}

}
