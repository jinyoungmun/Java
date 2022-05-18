package study01;

public class IPTV extends ColorTV{  // 문진영
	
	
	String ip;
	
	IPTV(String i, int size, int color){
		super(size,color);
		ip = i;
	}
	
	void printProperty() {
		System.out.println("IP 주소가 "+ip+"이고,"+getSize()+"인치"+color+"컬러");
	}
}
