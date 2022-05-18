package study01;

public class ColorTV extends TV{  // 문진영
	
	int color;
	
	ColorTV(int size, int c){
		super(size);
		color = c;
	}
	void printProperty() {
		System.out.println(getSize()+"인치"+color+"컬러");
		}
	

}
