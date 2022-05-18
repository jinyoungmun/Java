package study01;

public class AccessEx {

	public static void main(String[] args) {

		Sample samp = new Sample();
		samp.a = 10; // public 이므로 가능
		samp.get_b();// private 이므로 sample 까지는 접근가능하나 b에는 불가능
		//samp.get_b(20);
		samp.c = 30; //당연히 가능
		
		System.out.println("a : " + samp.a);
		System.out.println("b : " + samp.get_b());// samp.get_b(20);
		System.out.println("c : " + samp.c);
	}

}
