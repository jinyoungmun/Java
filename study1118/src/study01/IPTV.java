package study01;

public class IPTV extends ColorTV{  // ������
	
	
	String ip;
	
	IPTV(String i, int size, int color){
		super(size,color);
		ip = i;
	}
	
	void printProperty() {
		System.out.println("IP �ּҰ� "+ip+"�̰�,"+getSize()+"��ġ"+color+"�÷�");
	}
}
