package study01;

public class AccessEx {

	public static void main(String[] args) {

		Sample samp = new Sample();
		samp.a = 10; // public �̹Ƿ� ����
		samp.get_b();// private �̹Ƿ� sample ������ ���ٰ����ϳ� b���� �Ұ���
		//samp.get_b(20);
		samp.c = 30; //�翬�� ����
		
		System.out.println("a : " + samp.a);
		System.out.println("b : " + samp.get_b());// samp.get_b(20);
		System.out.println("c : " + samp.c);
	}

}
