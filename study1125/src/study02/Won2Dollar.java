package study02;

public class Won2Dollar extends Converter{
	

	Won2Dollar(double r){
		ratio = r;
	}
	
	@Override
	protected String getInString(){
		return "��";
	}
	
	@Override
	protected String getOutString() {
		return "�޷�";
	}
	
	@Override
	protected double conver(double src) {
		return src/ratio;
	}
}
