package study01;

public class ColorTV extends TV{  // ������
	
	int color;
	
	ColorTV(int size, int c){
		super(size);
		color = c;
	}
	void printProperty() {
		System.out.println(getSize()+"��ġ"+color+"�÷�");
		}
	

}
