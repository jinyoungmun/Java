package study02;

public class Won2Dollar extends Converter{
	

	Won2Dollar(double r){
		ratio = r;
	}
	
	@Override
	protected String getInString(){
		return "¿ø";
	}
	
	@Override
	protected String getOutString() {
		return "´Þ·¯";
	}
	
	@Override
	protected double conver(double src) {
		return src/ratio;
	}
}
