package study04;

public class Km2Mile extends Converter{  // ¹®Áø¿µ
	
	@Override
    protected double convert(double src) {
        return src/ratio;
    }
    
    @Override
    protected String getSrcString() {
        return "km";
    }
    
    @Override
    protected String getDesString() {
        return "mile";
    }
    
    Km2Mile(double r) {
        this.ratio = r;
    }
    
    @Override
    public void run() {
        super.run();
    }
}

