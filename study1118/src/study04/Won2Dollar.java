package study04;

public class Won2Dollar extends Converter{  // 문진영
	
	@Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDesString() {
        return "달러";
    }
    
    Won2Dollar(double ratio) {
        this.ratio = ratio;
    }
    
    @Override
    public void run() {
        super.run();
    }

}