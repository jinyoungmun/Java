package study04;

public class Won2Dollar extends Converter{  // ������
	
	@Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "��";
    }

    @Override
    protected String getDesString() {
        return "�޷�";
    }
    
    Won2Dollar(double ratio) {
        this.ratio = ratio;
    }
    
    @Override
    public void run() {
        super.run();
    }

}