package study02;

public class Km2Mile extends Converter{

	Km2Mile(double r){
		ratio = r;
	}
	
	@Override
	protected String getInString() {
		return "km";
	}
	@Override
	protected String getOutString() {
		return "mile";
	}
	
	@Override
	protected double conver(double src) {
		return src/ratio;
	}
	
}
